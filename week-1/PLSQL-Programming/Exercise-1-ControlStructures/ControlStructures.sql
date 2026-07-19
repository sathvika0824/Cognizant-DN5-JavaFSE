SET SERVEROUTPUT ON;

---------------------------------------------------
-- SCENARIO 1
-- Apply 1% discount to customers above 60 years
---------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT c.CustomerID, c.Age, l.InterestRate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
    )
    LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Interest rate updated for Customer ID: ' || rec.CustomerID
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

---------------------------------------------------
-- SCENARIO 2
-- Promote customers to VIP
---------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT CustomerID, Balance
        FROM Customers
    )
    LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = rec.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Customer ' || rec.CustomerID || ' promoted to VIP.'
            );
        END IF;
    END LOOP;

    COMMIT;
END;
/

---------------------------------------------------
-- SCENARIO 3
-- Loan due reminder
---------------------------------------------------

BEGIN
    FOR rec IN (
        SELECT c.Name,
               l.DueDate
        FROM Customers c
        JOIN Loans l
        ON c.CustomerID = l.CustomerID
        WHERE l.DueDate BETWEEN SYSDATE AND SYSDATE + 30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder: Loan for '
            || rec.Name
            || ' is due on '
            || TO_CHAR(rec.DueDate,'DD-MON-YYYY')
        );
    END LOOP;
END;
/
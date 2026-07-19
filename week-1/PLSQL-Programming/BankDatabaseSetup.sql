-- Create Customers Table
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    Age NUMBER,
    Balance NUMBER,
    IsVIP VARCHAR2(5)
);

-- Create Loans Table
CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    InterestRate NUMBER,
    DueDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert Sample Customers
INSERT INTO Customers VALUES (1, 'Ravi', 65, 8000, 'FALSE');
INSERT INTO Customers VALUES (2, 'Anita', 45, 15000, 'FALSE');
INSERT INTO Customers VALUES (3, 'John', 70, 25000, 'FALSE');
INSERT INTO Customers VALUES (4, 'Priya', 30, 5000, 'FALSE');

-- Insert Sample Loans
INSERT INTO Loans VALUES (101, 1, 10, SYSDATE + 10);
INSERT INTO Loans VALUES (102, 2, 12, SYSDATE + 40);
INSERT INTO Loans VALUES (103, 3, 11, SYSDATE + 20);
INSERT INTO Loans VALUES (104, 4, 9, SYSDATE + 5);

COMMIT;
---------------------------------------------------
-- Create Accounts Table
---------------------------------------------------

CREATE TABLE Accounts (
    AccountID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    AccountType VARCHAR2(20),
    Balance NUMBER,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

---------------------------------------------------
-- Sample Accounts
---------------------------------------------------

INSERT INTO Accounts VALUES (101,1,'Savings',10000);
INSERT INTO Accounts VALUES (102,2,'Savings',15000);
INSERT INTO Accounts VALUES (103,3,'Savings',25000);
INSERT INTO Accounts VALUES (104,4,'Current',5000);

---------------------------------------------------
-- Create Employees Table
---------------------------------------------------

CREATE TABLE Employees (
    EmployeeID NUMBER PRIMARY KEY,
    EmployeeName VARCHAR2(100),
    Department VARCHAR2(50),
    Salary NUMBER
);

---------------------------------------------------
-- Sample Employees
---------------------------------------------------

INSERT INTO Employees VALUES (1,'Rahul','IT',50000);
INSERT INTO Employees VALUES (2,'Anita','IT',60000);
INSERT INTO Employees VALUES (3,'John','HR',45000);
INSERT INTO Employees VALUES (4,'Priya','Finance',55000);

COMMIT;
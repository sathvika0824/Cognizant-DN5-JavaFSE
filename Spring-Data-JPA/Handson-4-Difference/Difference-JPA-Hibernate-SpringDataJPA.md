# Difference between JPA, Hibernate and Spring Data JPA

## JPA (Java Persistence API)
- JPA is a specification/set of rules
- It does not contain actual implementation
- Just defines how Java objects should be mapped to database tables

## Hibernate
- Hibernate is an ORM tool that implements JPA
- It is the actual worker that talks to the database
- Contains concrete implementation of JPA specification

## Spring Data JPA
- Spring Data JPA sits on top of Hibernate
- It reduces boilerplate code drastically
- Manages transactions automatically
- Example: instead of 8 lines of Hibernate code, just one line:
  employeeRepository.save(employee);

## Summary
JPA = Rules
Hibernate = Implements those rules
Spring Data JPA = Makes it easier to use Hibernate
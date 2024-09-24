XYZBank - Loans Management System

This project is a Java-based Loans Management System for the XYZBank, developed as part of CO1105 Coursework 1. The system allows users to input and manage loan records for bank customers, keeping track of multiple loans with details such as loan type, interest rate, amount left to pay, and loan term.

Features
Loan Record Management:
The system supports recording and managing multiple loans for customers, including loan type, interest rate, loan amount left, and time left for repayment.
Object-Oriented Design:
The system is structured with two main classes:
XYZBankRecord: Represents an individual loan record.
XYZBank: The main class where the user interacts with the system.
User Interaction:
Users can input details for multiple loan records with a defined maximum, and the system will format and display the records in a tabular format.

Classes
XYZBankRecord
The XYZBankRecord class encapsulates the following fields for each loan:

Record ID: Unique identifier for the loan record.
Customer ID: The ID of the customer associated with the loan.
Loan Type: The type of loan (Auto, Builder, Mortgage, Personal, or Other).
Interest Rate: The interest rate for the loan.
Amount Left: The remaining loan amount (in thousands of pounds).
Time Left: The loan term left (in years).
Methods in the class allow for reading and updating these fields, as well as displaying the details of a record in a formatted manner.

XYZBank
This is the main class that interacts with the user. Key functionalities include:

Inputting loan details from the user.
Storing records in an array of XYZBankRecord objects.
Displaying the registered records in a formatted table.
Example Output
After registering loan records, the system outputs the data in a formatted table like below:


RecordID   CustomerID LoanType   IntRate  AmountLeft TimeLeft
000001     AAA001     Auto       13.50    26         10
000102     BBB002     Mortgage   6.95     157        18

How to Run
Compile the code using any Java compiler or IDE.
Run the XYZBank class.
Input the maximum number of records and then input the details for each record.

Notes
The system includes basic input validation but does not handle erroneous inputs like invalid loan types or non-numeric values for interest rates, amounts, and terms.
To ensure correctness, the record ID is auto-generated using the format XXXXXX and customer ID follows the format AAAXXX.

// Importing the Scanner class for java.util package for the user to be able to input
import java.util.Scanner;

// Represents a record in the XYZBank
class XYZBankRecord {
    private String recordID;		// Unique identifier for the record
    private String customerID;		// The Customer ID which is associated with the loan
    private String loanType;		// The type of loan (Auto,Builder, etc)
    private double interestRate;	// The interest rate applied to the loan as a percentage
    private double amountLeft;		// Remaining loan amount
    private int timeLeft;			// Remaining time in months for the loan repayment

    // Constructor for creating a record with default values
    public XYZBankRecord() {
    	// Establishing fields with default values
        this.recordID = "";
        this.customerID = "";
        this.loanType = "";
        this.interestRate = 0.0;
        this.amountLeft = 0.0;
        this.timeLeft = 0;
    }

    // Constructor for creating a record with specific values
    public XYZBankRecord(String recordID, String customerID, String loanType, double interestRate, double amountLeft, int timeLeft) {
        // Once again establishing fields with specific values
    	this.recordID = recordID;
        this.customerID = customerID;
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.amountLeft = amountLeft;
        this.timeLeft = timeLeft;
    }

    // Getter method to retrieve the Record ID
    public String getRecordID() {
        return recordID;
    }

    // Setter method to set the Record ID
    public void setRecordID(String recordID) {
        this.recordID = recordID;
    }

    // Setter method to set customerID
    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    // Setter method to set loan type
    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    // Setter method to set the interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Setter method to set the amount left
    public void setAmountLeft(double amountLeft) {
        this.amountLeft = amountLeft;
    }
    
    // Setter method for the time left
    public void setTimeLeft(int timeLeft) {
        this.timeLeft = timeLeft;
    }

    // Method to display the record details
    public void displayRecord() {
        System.out.printf("%-10s %-10s %-10s %-8.2f %-8.0f %-5d\n", recordID, customerID, loanType, interestRate, amountLeft, timeLeft);
    }
}

// Main class
public class XYZBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner object for the user to be able to input

        // Maximum number of records from the user
        System.out.print("Enter the maximum number of records: ");
        int maxRecords = scanner.nextInt();

        // Creating an array. To store the bank records (XYZBankRecord objects)
        XYZBankRecord[] records = new XYZBankRecord[maxRecords];

        // Counter for registered records set to 0
        int registeredRecords = 0;

        // Keeps on looping until the maximum records are reached or user chooses to stop
        while (registeredRecords < maxRecords) {
            System.out.println("Enter details for Record " + (registeredRecords + 1));

            // Create a new bank record object
            XYZBankRecord record = new XYZBankRecord();
            
            // Set the record ID using formatted string. Based on the record number
            record.setRecordID(String.format("%06d", registeredRecords + 1));

            // Within loop, prompt user for record details and set all fields using methods
            System.out.print("Customer ID: ");
            record.setCustomerID(scanner.next());

            System.out.print("Loan Type (Auto/Builder/Mortgage/Personal/Other): ");
            record.setLoanType(scanner.next());

            System.out.print("Interest Rate: ");
            record.setInterestRate(scanner.nextDouble());

            System.out.print("Amount Left (in thousands pounds): ");
            record.setAmountLeft(scanner.nextDouble());

            System.out.print("Loan Term Left (in years): ");
            record.setTimeLeft(scanner.nextInt());

            // Add the record to the array
            records[registeredRecords] = record;

            // Increment number of registered records by 1
            registeredRecords++;

            System.out.println("Record Registered!\n");

            // Ask the user if another record needs to be added
            System.out.print("Do you want to enter another record? (yes/no): ");
            String continueInput = scanner.next();

            // If they don't want to continue
            if (!continueInput.equalsIgnoreCase("yes")) {
                break; // Exits the loop
            }
        }

        // Displays registered records in a formatted table
        System.out.println("\nPrinting Registered Records:");
        System.out.printf("%-10s %-10s %-10s %-8s %-8s %-5s\n", "RecordID", "CustomerID", "LoanType", "IntRate", "AmountLeft", "TimeLeft");

        //  Iterate through the array and display each record
        for (int i = 0; i < registeredRecords; i++) {
            records[i].displayRecord(); // Display details of current XYZBankRecord in formatted way
        }

        // Closing the scanner object
        scanner.close();
    }
}
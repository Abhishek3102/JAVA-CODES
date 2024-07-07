import java.util.Scanner;

class Account {
    protected String cust_name;
    protected long acc_no;

    public void getAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        cust_name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        acc_no = scanner.nextLong();
    }
}

class SavingAcc extends Account {
    protected double min_bal;
    protected double saving_bal;

    public void getSavingAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Minimum Balance: ");
        min_bal = scanner.nextDouble();

        System.out.print("Enter Saving Balance: ");
        saving_bal = scanner.nextDouble();
    }
}

class AccountDetails extends SavingAcc {
    protected double deposit;
    protected double withdraw;

    public void getAccountDetails() {
        super.getAccountDetails();
        super.getSavingAccountDetails();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Deposit Amount: ");
        deposit = scanner.nextDouble();

        System.out.print("Enter Withdrawal Amount: ");
        withdraw = scanner.nextDouble();
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details:");
        System.out.println("Customer Name: " + cust_name);
        System.out.println("Account Number: " + acc_no);
        System.out.println("Minimum Balance: " + min_bal);
        System.out.println("Saving Balance: " + saving_bal);
        System.out.println("Deposit Amount: " + deposit);
        System.out.println("Withdrawal Amount: " + withdraw);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.getAccountDetails();
        accountDetails.displayAccountDetails();

        // Release memory occupied by all accounts
        AccountDetails.delAccount();

        // Explicitly invoke garbage collector
        System.gc();
    }
}


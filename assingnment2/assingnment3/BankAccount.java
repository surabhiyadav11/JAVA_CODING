package assingnment3;

class BankAccount {

    int AccountNumber;
    String name;
    double AccountBalance;

    BankAccount() {

        AccountNumber = 0;
        name = "unknown";
        AccountBalance = 0;
    }

    BankAccount(int AccountNumber, String name, double AccountBalance) {

        this.AccountNumber = AccountNumber;
        this.name = name;
        this.AccountBalance = AccountBalance;
    }

    void display() {

        System.out.println("=================================================");
        System.out.println("The number is : " + AccountNumber);
        System.out.println("The name is : " + name);
        System.out.println("Balance is : " + AccountBalance);
    }
}

public class BankAccount1 {

    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount(1234, "surabhi", 100);

        System.out.println("Details of b1:");
        b1.display();

        System.out.println("Details of b2:");
        b2.display();
    }
}
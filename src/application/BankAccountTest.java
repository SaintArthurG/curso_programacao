package application;

import entities.BankAccount;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder: ");
        String titular = sc.nextLine();
        System.out.println("Enter account number: ");
        int nmrAccount = sc.nextInt();
        System.out.println("Is there an initial deposit (y/n)?");
        char resp = sc.next().charAt(0);
        double deposit = 0;
        if (resp == 'y'){
            System.out.println("Enter initial deposit value: ");
            deposit = sc.nextDouble();
        } else if (resp == 'n') {
            deposit = 0;
        } else {
            System.out.println("Digito invalido");
            return;
        }
        BankAccount account = new BankAccount(titular, nmrAccount, deposit);

        System.out.println("Account data:\n" + "Account: " + account.getNmrAccount() + " Holder: " + account.getTitular() + ", Balance: $" + account.getBalance());

        System.out.println("Enter a deposity value: ");
        double accountDeposit =sc.nextDouble();
        account.addBalance(accountDeposit);
        System.out.println(account);

        System.out.println("Enter a withdraw value: ");
        double accountWithdraw = sc.nextDouble();
        account.withdrawBalance(accountWithdraw);

        System.out.println(account);

        sc.close();
    }
}

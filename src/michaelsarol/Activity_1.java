package michaelsarol; 

import java.util.ArrayList;
import java.util.Scanner;
import Banking.BankingClass;

public class Activity_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<BankingClass> accounts = new ArrayList<>(); 

        System.out.println("HELLO WELCOME TO THE SYSTEM!");
        System.out.println("1. Banking");
        System.out.println("2. Shopping");
        System.out.println("3. Pay Bills");

        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                int response;
                do {
                    System.out.println("\n--- BANKING MENU ---");
                    System.out.println("1. Register Account");
                    System.out.println("2. Sign In");
                    System.out.println("3. View All Accounts");
                    System.out.println("4. Exit Banking");

                    System.out.print("Enter choice: ");
                    int action = sc.nextInt();

                    switch (action) {
                        case 1:
                            
                            BankingClass newAccount = new BankingClass();
                            System.out.print("Enter Account No.: ");
                            newAccount.setAccNo(sc.nextInt());
                            System.out.print("Set Account Pin: ");
                            newAccount.setPin(sc.nextInt());
                            accounts.add(newAccount);
                            System.out.println("Registered successfully!");
                            break;

                        case 2:
   
                            System.out.print("Enter Account No.: ");
                            int account = sc.nextInt();
                            System.out.print("Enter Pin No.: ");
                            int pin = sc.nextInt();

                            BankingClass found = null;
                            for (BankingClass acc : accounts) {
                                if (acc.verifyAccount(account, pin)) {
                                    found = acc;
                                    break;
                                }
                            }

                                if (found != null) {
                            System.out.println("Login success!");

                            int loggedInChoice;
                    do {
                            System.out.println("\n--- ACCOUNT MENU ---");
                            System.out.println("1. View Account Info");
                            System.out.println("2. Deposit Money");
                            System.out.println("3. Withdraw Money");
                            System.out.println("4. Logout");
                            System.out.println("5. View balance");
                            System.out.print("Choose an option: ");
                            loggedInChoice = sc.nextInt();

                            switch (loggedInChoice) {
                                case 1:
                                    System.out.println("Account No: " + found.getAccNo());
                                    System.out.println("Balance: " + found.getBalance());
                                break;

                                case 2:
                                    System.out.print("Enter amount: ");
                                    float depositAmount = sc.nextFloat();
                                    found.deposit(depositAmount);
                                break;

                                case 3:
                                    System.out.print("Enter amount: ");
                                    float withdrawAmount = sc.nextFloat();
                                    found.withdraw(withdrawAmount);
                                break;

                                case 4:
                                    System.out.println("Account No: " + found.getAccNo());
                                    System.out.println("Balance: " + found.getBalance());
                                break;
                                
                                case 5:
                                    System.out.println("Logged out... ");
                                break;

                                default:
                                    System.out.println("Invalid choice. Try again.");
                            }
                    } while (loggedInChoice != 4);

                                } else {
                                    System.out.println("Invalid account/PIN.");
                                }
                                break;


                        case 3:
                           
                            if (accounts.isEmpty()) {
                                System.out.println("No accounts registered.");
                            } else {
                                for (int i = 0; i < accounts.size(); i++) {
                                    System.out.println("Account " + (i + 1) + ": " + accounts.get(i).getAccNo());
                                }
                            }
                            break;

                        case 4:
                            System.out.println("Exiting Banking Menu...");
                            response = 0;
                            continue; 
                        default:
                            System.out.println("Invalid choice. Try again.");
                    }

                    System.out.print("Continue in Banking? (1 = Yes, 0 = No): ");
                    response = sc.nextInt();

                } while (response == 1);
                break;

            case 2:
               
        
        switch(choice){
            case 1:
       
                BankingClass bc = new BankingClass();
               int attemp = 0;
                
                
               while (attemp < 3) {
                    System.out.print("Enter your Account No: ");
                    int accountNo = sc.nextInt();

                    System.out.print("Enter your Pin: ");
                    int pin = sc.nextInt();

                    if (bc.verifyAccount(accountNo, pin)) {
                        System.out.println("LOGIN SUCCESS");
                        break;
                    } else {
                        attemp++;
                        if (attemp < 3) {
                            System.out.println("Incorrect account number or PIN. Attempt " + attemp + " of 3.");
                        } else {
                            System.out.println("Maximum attempts reached.");
                            System.exit(0);
                        }
                    }
                }
                break;

            case 2:
     
                break;

            case 3:
                
                break;

            default:
                System.out.println("Invalid selection");
        }

        sc.close();
    }
}
}

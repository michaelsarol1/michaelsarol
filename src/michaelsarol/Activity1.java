package michaelsarol;

import java.util.Scanner;
import Banking.bankingClass;

public class Activity1 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World");
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("HELLO WELCOME TO THE SYSTEM!");
            System.out.println("What do you feel doing today?");
            System.out.println("1. Banking");
            System.out.println("2. Doctors Appointment");
            System.out.println("3. Shopping");
            
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    bankingClass bc = new bankingClass();
                    int attempts = 0;
                    
                    while (attempts < 3) {
                        System.out.print("Enter your Account No: ");
                        int accountNo = sc.nextInt();
                        
                        System.out.print("Enter your Pin: ");
                        int pin = sc.nextInt();
                        
                        if (bc.verifyAccount(accountNo, pin)) {
                            System.out.println("LOGIN SUCCESS");
                            break;
                        } else {
                            attempts++;
                            if (attempts < 3) {
                                System.out.println("Incorrect account number or PIN. Attempt " + attempts + " of 3.");
                            } else {
                                System.out.println("Maximum attempts reached. Exiting system...");
                                System.exit(0);
                            }
                        }
                    }
                    break;
                    
                case 2:
                    System.out.println("Doctor appointment feature is under construction.");
                    break;
                    
                case 3:
                    System.out.println("Shopping feature is under construction.");
                    break;
                    
                default:
                    System.out.println("Invalid Selection!");
            }
        }
    }
}
    


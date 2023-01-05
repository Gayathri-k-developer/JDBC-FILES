import java.util.Scanner;

public class my_ATM

{
    public static void main(String[] args) {
        int Pin = 1234;
        int Balance = 2000;

        int Addamount = 0;
        int Takeamount = 0;

        String name;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your PIN NUMBER ");
        int password = in.nextInt();

        if (password == Pin) {

            System.out.println("enter your NAME:");
            name = in.next();
            System.out.println("welcome   " + name);

            while (true) {
                System.out.println("Press 1 to CHECK your balance");
                System.out.println("Press 2 to  ADD your amount");
                System.out.println("Press 3 to DEBIT your amount");
                System.out.println("Press 4 to take RECEIPT");
                System.out.println("Press 5 to EXIT");

                int opt = in.nextInt();
                switch (opt) {
                    case 1:
                        System.out.println("Your current BALANCE is " + Balance);
                        break;
                    case 2:
                        System.out.println(" How much amount do you want to add");
                        Addamount = in.nextInt();
                        System.out.println("SUCCESSFULLY CREDITED");
                        Balance = Addamount + Balance;
                        break;
                    case 3:
                        System.out.println(" How much amount do you want to withdraw");
                        Takeamount = in.nextInt();
                        if (Takeamount > Balance) {
                            System.out.println("INSUFFICIENT BALANCE");
                            System.out.println("Please check your balance");

                        } else {
                            System.out.println("SUCCESSFULLY WITHDRAW");
                            Balance = Balance - Takeamount;

                        }
                        break;
                    case 4:
                        System.out.println("WELCOME TO MY ATM...");
                        System.out.println("Available balance is " + Balance);
                        System.out.println("Amount Deposited " + Addamount);
                        System.out.println("Amount Debited " + Takeamount);
                        System.out.println("THANK FOR COMING");
                        break;
                }
                if (opt == 5) {
                    System.out.println("THANK YOU");
                    break;
                }

            }

        } else {
            System.out.println("Wrong pin number ");
            System.out.println("Try again");
        }
    }
}

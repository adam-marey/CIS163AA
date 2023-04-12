import java.util.Scanner;
// Pe10_7.java solution part 2
public class ATM {
    public static void main(String[] args) {
        Pe10_7[] accounts = new Pe10_7[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Pe10_7(i, 100);
        }

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an id: ");
            int id = scanner.nextInt();

            if (id >= 0 && id <= 9) {
                boolean exitMenu = false;

                while (!exitMenu) {
                    System.out.println("\nMain menu");
                    System.out.println("1: check balance");
                    System.out.println("2: withdraw");
                    System.out.println("3: deposit");
                    System.out.println("4: exit");
                    System.out.print("Enter a choice: ");

                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            System.out.printf("The balance is %.2f\n", accounts[id].getBalance());
                            break;
                        case 2:
                            System.out.print("Enter an amount to withdraw: ");
                            double withdrawAmount = scanner.nextDouble();
                            accounts[id].withdraw(withdrawAmount);
                            break;
                        case 3:
                            System.out.print("Enter an amount to deposit: ");
                            double depositAmount = scanner.nextDouble();
                            accounts[id].deposit(depositAmount);
                            break;
                        case 4:
                            exitMenu = true;
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                }
            } else {
                System.out.println("Please enter a correct id.");
            }
        }
    }
}

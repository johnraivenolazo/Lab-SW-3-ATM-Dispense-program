import java.util.Scanner;

public class BPI_Atm {
    public static void main(String[] args) {
        ATMDispenseChain atmDispenser = new ATMDispenseChain();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter amount to dispense: ");
        int amount = scanner.nextInt();
        if (amount % 10 != 0) {
            System.out.println("Amount should be in multiples of 10s.");
        } else {
            atmDispenser.dispense(new Currency(amount));
        }
        scanner.close();
    }
}

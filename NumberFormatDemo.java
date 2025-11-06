package co3_scena;
import java.util.Scanner;
public class NumberFormatDemo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            String input = sc.nextLine();

            int number = Integer.parseInt(input);
            System.out.println("Converted number = " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Error: Input is not a valid integer!");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}

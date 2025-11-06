package co3_scena;
import java.util.Scanner;
public class ArrayIndexDemo {
	public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter array index (0-4): ");
            int index = sc.nextInt();
            System.out.println("Value at index " + index + " = " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of range!");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}

package tasks;
import java.util.Scanner;
public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number a:");
		int a=sc.nextInt();
		System.out.println("Enter a number b:");
		int b=sc.nextInt();
		System.out.println("And operation:"+(a&b)+"Binary:"+Integer.toBinaryString(a&b));
		System.out.println("OR operation:"+(a|b)+"Binary:"+Integer.toBinaryString(a|b));
		System.out.println("XOR operation:"+(a^b)+"Binary:"+Integer.toBinaryString(a^b));
		System.out.println("Left shift operation:"+(a<<b)+"Binary:"+Integer.toBinaryString(a<<b));
		System.out.println("Right shift operation:"+(a>>b)+"Binary:"+Integer.toBinaryString(a>>b));
		sc.close();
	}

}

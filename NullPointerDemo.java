package co3_scena;

public class NullPointerDemo {
	public static void main(String[] args) {
        String str = null;

        try {
            System.out.println("String length = " + str.length());
        }
        catch (NullPointerException e) {
            System.out.println("Error: String is null!");
        }

        System.out.println("Program continues...");
    }
}

package co2_scena;

class Animal {
    // Common behavior
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Lion extends Animal {
    // Specific behavior of Lion
    public void roar() {
        System.out.println("Lion roars loudly!");
    }
}
public class ZooApplication {
	public static void main(String[] args) {
        Lion lion = new Lion();  // Creating Lion object
        lion.eat();  // Inherited method
        lion.roar(); // Lion's own method
    }
}

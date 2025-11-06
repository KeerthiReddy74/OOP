package co2_scena;

class Anima {
    public void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Anima {
    public void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class PetManagement {
	 public static void main(String[] args) {
	        Puppy puppy = new Puppy();
	        puppy.eat();  // from Animal
	        puppy.bark(); // from Dog
	        puppy.weep(); // from Puppy
	    }
}

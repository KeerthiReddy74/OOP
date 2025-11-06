package co2_scena;

abstract class FoodOrder {
    abstract double calculateTotal(); // implemented differently by subclasses

    public void generateBill() { // common for all
        System.out.println("------ BILL ------");
        System.out.println("Total Amount: ₹" + calculateTotal());
        System.out.println("------------------");
    }
}

class RestaurantOrder extends FoodOrder {
    double price = 250;
    double tax = 50;
    double delivery = 30;

    @Override
    double calculateTotal() {
        return price + tax + delivery;
    }
}

class CloudKitchenOrder extends FoodOrder {
    double price = 200;
    double packaging = 20;
    double delivery = 25;

    @Override
    double calculateTotal() {
        return price + packaging + delivery;
    }
}
public class FoodDeliveryApp {
	public static void main(String[] args) {
        FoodOrder order1 = new RestaurantOrder();
        order1.generateBill();

        FoodOrder order2 = new CloudKitchenOrder();
        order2.generateBill();
    }
}

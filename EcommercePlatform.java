package co2_scena;
interface CourierService {
    void shipProduct();
}

// Implementations
class BlueDart implements CourierService {
    public void shipProduct() {
        System.out.println("Product shipped via BlueDart (Fast Delivery)");
    }
}

class FedEx implements CourierService {
    public void shipProduct() {
        System.out.println("Product shipped via FedEx (International)");
    }
}

class DHL implements CourierService {
    public void shipProduct() {
        System.out.println("Product shipped via DHL (Economy)");
    }
}

// Factory class
class CourierFactory {
    public static CourierService getCourier(String criteria) {
        switch (criteria.toLowerCase()) {
            case "fast":
            case "priority":
                return new BlueDart();
            case "international":
                return new FedEx();
            case "cheap":
            case "economy":
                return new DHL();
            default:
                return new DHL(); // fallback
        }
    }
}
public class EcommercePlatform {
	public static void main(String[] args) {
        CourierService courier = CourierFactory.getCourier("fast");
        courier.shipProduct();
    }
}

package co2_scena;
abstract class Plan {
    protected double rate;

    abstract void getRate(); // abstract method

    public void calculateBill(int units) {
        System.out.println("Bill Amount: ₹" + rate * units);
    }
}

// Subclasses
class DomesticPlan extends Plan {
    @Override
    void getRate() {
        rate = 3.50; // Rs per unit
    }
}

class CommercialPlan extends Plan {
    @Override
    void getRate() {
        rate = 7.50;
    }
}

class IndustrialPlan extends Plan {
    @Override
    void getRate() {
        rate = 5.50;
    }
}

// Factory class to generate object
class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) return null;

        switch (planType.toLowerCase()) {
            case "domestic": return new DomesticPlan();
            case "commercial": return new CommercialPlan();
            case "industrial": return new IndustrialPlan();
            default: return null;
        }
    }
}

public class ElectricityBill {
	public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();

        Plan plan = factory.getPlan("commercial"); // change string to test other plans
        plan.getRate();
        plan.calculateBill(150); // 150 units used
    }
}

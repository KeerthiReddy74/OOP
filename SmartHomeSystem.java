package co2_scena;

class Appliance {
    public void turnOn() {
        System.out.println("Appliance is turned on");
    }
}

class Fan extends Appliance {
    public void rotate() {
        System.out.println("Fan is rotating");
    }
}

class CeilingFan extends Fan {
    public void setSpeed(int speed) {
        System.out.println("Ceiling fan speed set to: " + speed);
    }
}
public class SmartHomeSystem {
	 public static void main(String[] args) {
	        CeilingFan fan = new CeilingFan();
	        fan.turnOn();      // from Appliance
	        fan.rotate();      // from Fan
	        fan.setSpeed(5);   // from CeilingFan
	    }
}

package co2_scena;
abstract class TransportBooking {
    abstract double calculateFare(double distance);

    public void bookTicket() {
        System.out.println("Ticket booked successfully!");
    }
}

class BusBooking extends TransportBooking {
    @Override
    double calculateFare(double distance) {
        return distance * 1.2; // ₹1.2 per km
    }
}

class TrainBooking extends TransportBooking {
    @Override
    double calculateFare(double distance) {
        return distance * 0.8; // ₹0.8 per km
    }
}

class FlightBooking extends TransportBooking {
    @Override
    double calculateFare(double distance) {
        return distance * 5.5; // ₹5.5 per km
    }
}
public class TransportSystem {
	public static void main(String[] args) {
        TransportBooking b1 = new BusBooking();
        b1.bookTicket();
        System.out.println("Bus Fare: ₹" + b1.calculateFare(100));

        TransportBooking b2 = new TrainBooking();
        b2.bookTicket();
        System.out.println("Train Fare: ₹" + b2.calculateFare(100));

        TransportBooking b3 = new FlightBooking();
        b3.bookTicket();
        System.out.println("Flight Fare: ₹" + b3.calculateFare(100));
    }
}


package myproject6;

import java.util.ArrayList;

public class Myproject6 {

    public static void main(String[] args) {
  
        ArrayList<Ride> rides = new ArrayList<>();

        Ride ride1 = new Ride("Ahmet", "Kızılay", "Çankaya", 10.0, 20, 15.0);
        EconomyRide ride2 = new EconomyRide("Ayşe", "Karaköy", "Taksim", 5.0, 15, 12.0, 2.0);
        PremiumRide ride3 = new PremiumRide("Mehmet", "Havalimanı", "Kadıköy", 35.0, 45, 20.0, 50.0, 1.5);
        SharedRide ride4 = new SharedRide("Elif", "Alsancak", "Bornova", 12.0, 25, 10.0, 1.5, 3);

        rides.add(ride1);
        rides.add(ride2);
        rides.add(ride3);
        rides.add(ride4);

        for (Ride ride : rides) {
            System.out.println(ride.toString());
            System.out.println("Calculated Fare: " + ride.calculateFare() + " TL");
            System.out.println("----------------------------------------");
        }
    }
    
    
    
}

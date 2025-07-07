package custom;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections; 
class Biscuit {
    private String manufacturingLoc;
    private String expDate; 
    private String brand;
    public Biscuit(String manufacturingLoc, String expDate, String brand) {
        this.manufacturingLoc = manufacturingLoc;
        this.expDate = expDate;
        this.brand = brand;
    }
    public String getManufacturingLoc() {
        return manufacturingLoc;
    }
    public String getExpDate() {
        return expDate;
    }
    public String getBrand() {
        return brand;
    }
    @Override
    public String toString() {
        return "Biscuit [Brand: " + brand + ", Manufacturing Location: " + manufacturingLoc + ", Expiry Date: " + expDate + "]";
    }
}


public class Driver {
    public static void main(String[] args) {
        
        List<Biscuit> biscuits = new ArrayList<>();

        biscuits.add(new Biscuit("Bangalore", "2025-12-31", "Britannia"));
        biscuits.add(new Biscuit("Chennai", "2026-06-15", "Parle"));
        biscuits.add(new Biscuit("Mumbai", "2025-01-20", "Sunfeast"));
        biscuits.add(new Biscuit("Delhi", "2025-11-01", "Oreo"));
        biscuits.add(new Biscuit("Kolkata", "2026-03-10", "Good Day"));

        for (int i = 0; i < 10; i++) {
            biscuits.add(new Biscuit("Generic Location " + i, "2025-0" + (i + 1) + "-01", "Generic Brand " + i));
        }

        System.out.println("--- All Biscuit Properties ---");
        
        for (Biscuit biscuit : biscuits) {
            System.out.println(biscuit);
        }

        System.out.println("\n--- Biscuit with Oldest Expiry Date ---");
        if (biscuits.isEmpty()) {
            System.out.println("No biscuits in the list.");
        } else {
            Biscuit oldestExpDateBiscuit = biscuits.get(0); // Assume the first one is the oldest initially

            for (int i = 1; i < biscuits.size(); i++) {
                Biscuit currentBiscuit = biscuits.get(i);
                
                if (currentBiscuit.getExpDate().compareTo(oldestExpDateBiscuit.getExpDate()) < 0) {
                    oldestExpDateBiscuit = currentBiscuit;
                }
            }
            System.out.println(oldestExpDateBiscuit);
        }
    }
}
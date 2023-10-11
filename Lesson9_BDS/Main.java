package Lesson9_BDS;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        RealEstate house1 = new RealEstate("123 Main St", 3, 2, 250000.00);
        RealEstate condo1 = new RealEstate("456 Elm St", 1, 1, 125000.00);
        RealEstate land1 = new RealEstate("789 Oak St", 0, 0, 50000.00);
        RealEstate condotel1 = new Condotel("123 Main St", 2, 2, 150000, 10);
        RealEstate condotel2 = new Condotel("456 Pine St", 3, 2, 250000, 10);
        RealEstate condotel3 = new Condotel("789 Oak St", 1, 1, 90000, 10);

        RealEstateListing<RealEstate> listing = new RealEstateListing<>();
        listing.addListing(house1);
        listing.addListing(condo1);
        listing.addListing(land1);
        List<RealEstate> listings = listing.getListings();
        for (RealEstate realEstate : listings) {
            System.out.println(realEstate);
        }

    }
}

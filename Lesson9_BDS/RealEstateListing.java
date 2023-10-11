package Lesson9_BDS;

import java.util.ArrayList;
import java.util.List;

public class RealEstateListing<T extends RealEstate> {
    private List<T> listings =new ArrayList<>();
    public void addListing(T listing){
        listings.add(listing);
    }
    public boolean containsListing(T listing){
        return listings.contains(listing);
    }
    public List<T> getListings(){
        return listings;
    }
}

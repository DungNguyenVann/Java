package Lesson9_BDS;

public class Condotel extends RealEstate {
    private int capacity;

    public Condotel(String address, int bedrooms, int bathrooms, double price, int capacity) {
        super(address, bedrooms, bathrooms, price);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    @Override
    public String toString(){
        return super.toString()+" capacity"+capacity;
    }
}

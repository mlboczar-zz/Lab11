/**
 * Created by Megan on 4/20/2017.
 */
public class UsedCar extends Car {
    private int mileage;

    public UsedCar(String make, String model, int year, double price, int mileage) {
        super(make, model, year, price);        //pass info to parent class
        this.mileage = mileage;     //not in parent class, does not get passed
    }

    @Override
    public String toString(){
        return super.toString() + "\t" + mileage;
    }
}

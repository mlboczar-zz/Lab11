import java.util.ArrayList;

/**
 * Created by Megan on 4/20/2017.
 */
public class CarLot {
    private ArrayList<Car> carList = new ArrayList<>();

    //Method to call the cars constructor with the given input and add it to the list
    public void addNewCar (String make, String model, int year, double price) {
        carList.add(new Car (make, model, year, price));
    }

    public void addUsedCar (String make, String model, int year, double price, int mileage){
        carList.add(new UsedCar (make, model, year, price, mileage));
    }

    public void printAllCarsInLot (){
        for (Car c: carList) {
            if (c instanceof UsedCar) {
                System.out.println(c + "\tUsed Car");
            } else {
                System.out.println(c + "\t\t\tNew Car");
            }
        }
    }
}

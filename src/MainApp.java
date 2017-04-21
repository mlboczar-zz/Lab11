import java.util.Scanner;

/**
 * Created by Megan on 4/20/2017.
 */
public class MainApp {

    public static void main(String[] args) {

        CarLot carLot = new CarLot();       //default constructor
        //carLot.addNewCar("Ford", "Escape", 2017, 25300.99);
        //carLot.addNewCar("Ford", "Taurus", 2017, 24000.99);
        //carLot.addNewCar("Dodge", "Charger", 2017, 27000.00);
        //carLot.addUsedCar("Ford", "Fiesta", 2009, 1350.98, 30000);
        //carLot.addUsedCar("Ford", "Ranger", 2011, 1300.98, 30500);
        //carLot.addUsedCar("Dodge", "Stratus", 2010, 13000.00, 50000);
        for (int i = 0; i < 2; i++) {
            getCarDetailsFromUser(carLot);
        }
        carLot.printAllCarsInLot();
    }

    private static void getCarDetailsFromUser(CarLot carLot) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your car details below: ");
        System.out.println("Is the car new or used?");
        String userInput = scan.nextLine();
        boolean newCar = userInput.equalsIgnoreCase("new");
        System.out.println("What is the car make?");
        String make = scan.nextLine();
        System.out.println("What is the car model?");
        String model = scan.nextLine();
        System.out.println("What is the car year?");
        int year = scan.nextInt();
        System.out.println("What is the car price?");
        scan.nextLine();
        double price = scan.nextDouble();

        if (newCar) {
            carLot.addNewCar(make, model, year, price);
        } else {
            System.out.println("What is the car mileage?");
            scan.nextLine();
            int mileage = scan.nextInt();
            carLot.addUsedCar(make, model, year, price, mileage);
        }
    }
}

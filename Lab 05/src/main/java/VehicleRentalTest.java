/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinus
 */
public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car("CAR001", "Toyota", 5, 5000);
        Vehicle vehicle2 = new Bike("BIKE001", "Honda", 8, 300);

        System.out.println("Car Details:");
        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost: " +
                vehicle1.calculateRentalCost());

        System.out.println();

        System.out.println("Bike Details:");
        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost: " +
                vehicle2.calculateRentalCost());
    }
}

/*
This is runtime polymorphism because the method
calculateRentalCost() is chosen at runtime based on
the actual object type (Car or Bike).
*/

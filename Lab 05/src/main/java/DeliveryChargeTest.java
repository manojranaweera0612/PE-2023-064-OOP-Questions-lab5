/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinus
 */

    
public class DeliveryChargeTest {

    public static void main(String[] args) {

        DeliveryChargeCalculator calculator = new DeliveryChargeCalculator();

        System.out.println("Base Charge Only: " +
                calculator.calculateCharge(1000));

        System.out.println("Base + Distance Charge: " +
                calculator.calculateCharge(1000, 5));

        System.out.println("Base + Distance + Weight Charge: " +
                calculator.calculateCharge(1000, 5, 10));

        System.out.println("Base + Express Delivery: " +
                calculator.calculateCharge(1000, true));
    }
}

/*
This is compile-time polymorphism because Java chooses
which calculateCharge() method to call based on the
method parameters during compilation.
*/

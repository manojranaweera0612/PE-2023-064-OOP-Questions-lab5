/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinus
 */
public class DeliveryChargeCalculator {

    // Base charge only
    public double calculateCharge(double baseCharge) {
        return baseCharge;
    }

    // Base charge + distance charge
    public double calculateCharge(double baseCharge, double distanceKm) {
        return baseCharge + (distanceKm * 100.0);
    }

    // Base charge + distance + weight charge
    public double calculateCharge(double baseCharge, double distanceKm, double weightKg) {
        return baseCharge + (distanceKm * 100.0) + (weightKg * 50.0);
    }

    // Base charge + express delivery
    public double calculateCharge(double baseCharge, boolean expressDelivery) {
        if (expressDelivery) {
            return baseCharge + 500.0;
        }
        return baseCharge;
    }
}
package com.example.bridge.prep;

public class BakedPrep implements PreparationStyle {
    @Override
    public void prepareSushi(String sushiName, double basePrice) {
        double totalPrice = basePrice + 1.50;
        System.out.println("[BAKED PREPARATION] Baking " + sushiName + " in the oven with spicy sauce. Total Price: $" + totalPrice);
    }
}
package com.example.bridge.prep;

public class FreshPrep implements PreparationStyle {
    @Override
    public void prepareSushi(String sushiName, double basePrice) {
        System.out.println("[FRESH PREPARATION] Rolling fresh " + sushiName + " with raw ingredients. Price: $" + basePrice);
    }
}
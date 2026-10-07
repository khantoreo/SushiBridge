package com.example.bridge.order;

import com.example.bridge.prep.PreparationStyle;

public abstract class SushiOrder {
    protected PreparationStyle preparationStyle;

    public SushiOrder(PreparationStyle preparationStyle) {
        this.preparationStyle = preparationStyle;
    }

    public void setPreparationStyle(PreparationStyle preparationStyle) {
        this.preparationStyle = preparationStyle;
    }

    public abstract void makeOrder();
}
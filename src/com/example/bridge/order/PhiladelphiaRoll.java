package com.example.bridge.order;

import com.example.bridge.prep.PreparationStyle;

public class PhiladelphiaRoll extends SushiOrder {

    public PhiladelphiaRoll(PreparationStyle preparationStyle) {
        super(preparationStyle);
    }

    @Override
    public void makeOrder() {
        preparationStyle.prepareSushi("Philadelphia Roll", 8.99);
    }
}
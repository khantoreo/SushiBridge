package com.example.bridge.order;

import com.example.bridge.prep.PreparationStyle;

public class CaliforniaRoll extends SushiOrder {

    public CaliforniaRoll(PreparationStyle preparationStyle) {
        super(preparationStyle);
    }

    @Override
    public void makeOrder() {
        preparationStyle.prepareSushi("California Roll", 7.50);
    }
}
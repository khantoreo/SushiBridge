package com.example.bridge;

import com.example.bridge.order.CaliforniaRoll;
import com.example.bridge.order.PhiladelphiaRoll;
import com.example.bridge.order.SushiOrder;
import com.example.bridge.prep.BakedPrep;
import com.example.bridge.prep.FreshPrep;
import com.example.bridge.prep.PreparationStyle;

public class Main {
    public static void main(String[] args) {
        PreparationStyle fresh = new FreshPrep();
        PreparationStyle baked = new BakedPrep();

        SushiOrder philly = new PhiladelphiaRoll(fresh);
        philly.makeOrder();

        philly.setPreparationStyle(baked);
        philly.makeOrder();

        System.out.println("----------------------------------------");

        SushiOrder california = new CaliforniaRoll(baked);
        california.makeOrder();
    }
}
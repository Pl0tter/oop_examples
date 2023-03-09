package org.example.seminar01.cw02;

import java.util.ArrayList;

public abstract class VendingMachine {

    abstract void initProducts(ArrayList products);

    abstract Product getProductByName(String name);

    abstract Product getProductByCost(double cost);
}

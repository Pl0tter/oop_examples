package org.example.seminar01.hw01;

import java.util.ArrayList;

public abstract class VendingMachine {

    abstract void initProducts(ArrayList products);

    abstract Product getProduct(String name);

}

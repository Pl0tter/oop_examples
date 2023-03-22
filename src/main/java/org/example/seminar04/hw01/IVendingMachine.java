package org.example.seminar04.hw01;

import java.util.ArrayList;

interface IVendingMachine<T extends Product> {

    void initProducts(ArrayList<T> products);

    T getProduct(String name) throws IllegalStateException;

}

package org.example.seminar04.hw01;

interface IVendingMachineHD<T extends HotDrink> extends IVendingMachine<T> {

    T getProduct(String name, int temp, int volume) throws IllegalStateException;
}

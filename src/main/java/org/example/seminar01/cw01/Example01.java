package org.example.seminar01.cw01;

import java.util.ArrayList;
import java.util.Arrays;

public class Example01 {
    /**
     * Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
     * содержащий в себе методы initProducts (List <Product>) сохраняющий в себе список исходных продуктов
     * и getProduct(String name)
     *
     * @param args
     */
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        ArrayList<Product> products = new ArrayList<>(Arrays.asList(new Product("pepsi", 42),
                new Product("chocolate", 67),
                new Product("cola", 70)));
        vendingMachine.initProducts(products);
        System.out.println(vendingMachine.getProductByName("cola"));
        System.out.println(vendingMachine.getProductByCost(42));
    }
}

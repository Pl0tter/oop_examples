package org.example.seminar02.cw01;

public abstract class Buyer implements BuyerBehavior {
    protected String name;
    protected boolean isMakeOrderClass;
    protected boolean isTakeOrderClass;

    abstract String getName();


}

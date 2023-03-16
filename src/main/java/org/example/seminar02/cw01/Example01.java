package org.example.seminar02.cw01;

public class Example01 {
    public static void main(String[] args) {

        Human hm = new Human();
        hm.name = "Владимир";

        Market market = new Market();

        market.acceptToMarket(hm);
        market.takeInQueue(hm);
        market.giveOrder();
        market.takeOrder();
        market.releaseFromQueue();
        market.releaseFromMarket(hm);
        market.update();

    }
}

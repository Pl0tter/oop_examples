package org.example.seminar02.cw01;

public interface MarketBehavior {
    void acceptToMarket(Buyer actor);

    void releaseFromMarket(Buyer actor);

    void update();
}

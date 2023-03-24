package org.example.seminar05.hw01.model;

public abstract class BaseCalc {
    protected String a;
    protected String b;
    protected int numType;

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setNumType(int numType) {
        this.numType = numType;
    }

    public abstract String result();

}

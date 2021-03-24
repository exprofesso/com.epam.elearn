package com.epam.elearn.aggregationAndСomposition.fifth;

public class Client {
    private String name;
    private int prepay;
    private TourePackage tourePackage;

    public Client(String name, int prepay) {
        this.name = name;
        this.prepay = prepay;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrepay() {
        return prepay;
    }

    public void setPrepay(int prepay) {
        this.prepay = prepay;
    }

    public TourePackage getTourePackage() {
        return tourePackage;
    }

    public void setTourePackage(TourePackage tourePackage) {
        this.tourePackage = tourePackage;
    }
}

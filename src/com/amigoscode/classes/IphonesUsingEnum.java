package com.amigoscode.classes;

public class IphonesUsingEnum {

    private IphoneModel model;
    private double price;
    private boolean isWaterResistant;

    public IphoneModel getModel() {
        return model;
    }

    public void setModel(IphoneModel model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterResistant() {
        return isWaterResistant;
    }

    public void setWaterResistant(boolean waterResistant) {
        isWaterResistant = waterResistant;
    }

    public IphonesUsingEnum(IphoneModel model,double price,boolean isWaterResistant ) {
        this.model = model;
        this.price = price;
        this.isWaterResistant = isWaterResistant;
    }



    @Override
    public String toString() {
        return "IphonesUsingEnum{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", isWaterResistant=" + isWaterResistant +
                '}';
    }
}

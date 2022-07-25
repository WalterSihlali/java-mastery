package com.amigoscode.classes;

public class Classes {

    public static void main(String[] args) {

        Iphone iphone7Plus = new Iphone();
        Iphone iphoneXMax = new Iphone();

        iphone7Plus.setModel("7+");
        iphone7Plus.setPrice(200.00);
        iphone7Plus.setWaterResistant(false);

        System.out.println("iPhone 7+ attributes");

        System.out.println(iphone7Plus.getModel());
        System.out.println(iphone7Plus.getPrice());
        System.out.println(iphone7Plus.isWaterResistant());

        iphoneXMax.setModel("X Max");
        iphoneXMax.setPrice(400.00);
        iphoneXMax.setWaterResistant(true);
        System.out.println("X max attributes");
        System.out.println(iphoneXMax.getModel());
        System.out.println(iphoneXMax.getPrice());
        System.out.println(iphoneXMax.isWaterResistant());

        Iphone iPhone12 = new Iphone("iPhone 12",
                130.00,
                true);


        System.out.println(iPhone12.getModel());
        System.out.println(iPhone12.getPrice());
        System.out.println(iPhone12.isWaterResistant());


        // toString method
        System.out.println(iPhone12.toString());

        System.out.println("New attributes");

        IphonesUsingEnum newiphone = new IphonesUsingEnum(IphoneModel.IPHONE_7,200,true);
        System.out.println(newiphone);

    }
}

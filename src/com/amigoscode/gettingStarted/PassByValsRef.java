package com.amigoscode.gettingStarted;

import java.awt.*;

public class PassByValsRef {

    public static void main(String [] args) {
        int x = 0;
        int y = incrementValue(x);
        System.out.println(x);
        System.out.println(y);



        Point point = new Point(100,100);
        changePoint(point);
        System.out.println(point);
    }

    static int incrementValue(int value) {
        return value + 1;
    }

    static void changePoint(Point point) {
        point.x = 0;
        point.y = 0;
    }
}

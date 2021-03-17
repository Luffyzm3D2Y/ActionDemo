package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length=scanner.nextDouble();
        double width=scanner.nextDouble();
        double height=scanner.nextDouble();

        Cuboid cuboid=new Cuboid(length,width,height);
        System.out.println(cuboid.getVolume());
    }
}

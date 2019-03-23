package com.box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.print(" Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.print(" Please enter object's height:");
        float height = scanner.nextFloat();

        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        if (box3.validate(length, width, height)) {
            System.out.println("可以使用 Box3 的箱子");
        } else {
            if (box5.validate(length, width, height)) {
                System.out.println("可以使用 Box5 的箱子");
            } else {
                System.out.println("兩者都不符合！");
            }
        }

    }
}

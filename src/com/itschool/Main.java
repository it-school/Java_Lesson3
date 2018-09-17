package com.itschool;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        int a = 127;  // 01111111
        int b = 255;  // 11111111

        System.out.println(a^b);   //   10000000
        System.out.println(a|b);   //   11111111
        System.out.println(a&b);   //   01111111
        System.out.println(~b);    //   00000000

        System.out.println(a >> 3);  //   127 / 2^3 = 127 / 8 = 15
        System.out.println(a << 3);  //   127 * 2^3 = 127 * 8 = 1016

        System.out.println(2 + 2 * 2);


        for (int hours = 0; hours < 24; hours++)
        {
            for (int minutes = 0; minutes < 60; minutes++)
            {
                if (minutes == 10)
                    break;
                TimeUnit.MILLISECONDS.sleep(100l);
                System.out.println(hours + " : " + minutes);
            }
        }

    }
}

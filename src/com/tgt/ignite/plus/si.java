package com.tgt.ignite.plus;

import java.util.Scanner;

public class si {
    public static void main(String[] args)
    {
        int p,t;
        double r,s_i;
        Scanner read = new Scanner(System.in);
        System.out.println("enter principle amount");
        p = read.nextInt();
        System.out.println("enter time ");
        t= read.nextInt();
        System.out.println("enter rate of interest ");
        r = read.nextDouble();
        s_i = (p*t*r)/100;
        System.out.println("simple interest = " + s_i);
    }
}

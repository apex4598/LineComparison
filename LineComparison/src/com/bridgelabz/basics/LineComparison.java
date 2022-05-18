package com.bridgelabz.basics;

import java.util.Scanner;

public class LineComparison {

    public double x1, x2, y1, y2, length1;
    Scanner sc=new Scanner(System.in);
    public void calculateLength()
    {

        System.out.println("**** Welcome to Line Comparison Problem ****");
        System.out.println("Enter the value of x1 : ");
        //System.out.println("x1:"+x1);

        x1=sc.nextInt();
        System.out.println("Enter the value of y1 : ");
        y1=sc.nextInt();
        System.out.println("Enter the value of x2: ");
        x2=sc.nextInt();
        System.out.println("Enter the value of y2 : ");
        y2=sc.nextInt();

        double length1=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.println("Length of line is :" +length1);
    }
    public static void main(String[] args)
    {
        LineComparison lineComparison = new LineComparison();
        lineComparison.calculateLength();
    }
}

package com.bridgelabz.basics;

import java.util.Scanner;

public class LineComparison {

    public double x1, x2, y1, y2,x3,x4,y3,y4,length1,length2;
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
    public void checkEquality() {
        System.out.println("Enter the value of x3 : ");
        x3 = sc.nextInt();
        System.out.println("Enter the value of y3 : ");
        y3 = sc.nextInt();
        System.out.println("Enter the value of x4: ");
        x4 = sc.nextInt();
        System.out.println("Enter the value of y4 : ");
        y4 = sc.nextInt();

        double length2 = Math.sqrt(Math.pow(x4-x3,2) + Math.pow(y4-y3,2));

        System.out.println("Length of line is :" + length2);
        if (length1==length2) {
            System.out.println("Two Lines are Equal");
        } else {
            System.out.println("Two Lines are Not Equal");
        }
    }
    public static void main(String[] args)
    {
        LineComparison lineComparison = new LineComparison();
        lineComparison.calculateLength();
        lineComparison.checkEquality();
    }
}

package org.example;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        final double conv = 350; //conversion rate

        System.out.print("What is the length of the room in square feet? ");
        double len = input.nextDouble();
        System.out.print("What is the width of the room in square feet? ");
        double width = input.nextDouble();

        double area = calc.area(len, width);
        int paint = calc.paint(area, conv);

        if (paint > 1) {
            System.out.printf("You will need to purchase %d gallons of paint to cover %.2f square feet.", paint, area);
        } else {
            System.out.printf("You will need to purchase %d gallon of paint to cover %.2f square feet.", paint, area);
        }
    }
}

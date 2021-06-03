package org.example;

public class calc {
    public static double area(double len, double width) {
        return len * width;
    }

    public static int paint(double area, double conv) {
        return (int) Math.ceil(area / conv); //rounds up result
    }
}

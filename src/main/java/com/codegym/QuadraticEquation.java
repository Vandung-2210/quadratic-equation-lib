package com.codegym;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) return 0;
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) return 0;
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public void solve() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình vô số nghiệm.");
                } else {
                    System.out.println("Phương trình vô nghiệm.");
                }
            } else {
                System.out.println("Phương trình bậc nhất có 1 nghiệm: x = " + (-c / b));
            }
            return;
        }

        double delta = getDiscriminant();
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + getRoot1());
            System.out.println("x2 = " + getRoot2());
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép: x = " + (-b / (2 * a)));
        } else {
            System.out.println("Phương trình vô nghiệm.");
        }
    }
}

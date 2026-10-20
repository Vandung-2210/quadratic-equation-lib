package com.codegym;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== KIỂM THỬ THƯ VIỆN GIẢI PHƯƠNG TRÌNH BẬC 2 ===");

        System.out.println("\n1. Phương trình: 1x^2 - 4x + 4 = 0");
        QuadraticEquation eq1 = new QuadraticEquation(1, -4, 4);
        eq1.solve();

        System.out.println("\n2. Phương trình: 1x^2 - 5x + 6 = 0");
        QuadraticEquation eq2 = new QuadraticEquation(1, -5, 6);
        eq2.solve();

        System.out.println("\n3. Phương trình: 1x^2 + 1x + 1 = 0");
        QuadraticEquation eq3 = new QuadraticEquation(1, 1, 1);
        eq3.solve();
    }
}

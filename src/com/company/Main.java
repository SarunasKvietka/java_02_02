package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite skaiciu");
        Scanner sc = new Scanner(System.in);
        int sk1 = sc.nextInt();
        System.out.println("iveskite antra skaiciu");
        int sk2 = sc.nextInt();
        int suma = sk1 + sk2;
        int skirtumas = sk1 - sk2;
        System.out.println("suma=" + suma(sk1, sk2));
        System.out.println("suma=" + suma ((float)sk1, (float) sk2));
        System.out.println("skirtumas=" + skirtumas);
        System.out.println("skirtumas=" + skirtumas);

    }

    public static int suma(int sk1, int sk2) {
        return sk1 + sk2;
    }

    public static float suma(float sk1, float sk2) {
        return sk1 + sk2;
    }

    ;

    public static int skirtumas(int sk1, int sk2) {
        return sk1 - sk2;
    }

    public static float skirtumas(float sk1, float sk2) {
        return sk1 - sk2;
    }

    {


    }
}

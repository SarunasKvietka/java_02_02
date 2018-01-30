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
                System.out.println("suma=" + suma);
                System.out.println("skirtumas="+skirtumas);


    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ivedimas();
        System.out.println("suma " + skaiciuotuvas.suma(a, b));
        System.out.println("skirtumas " + skaiciuotuvas.skirtumas(a, b));
        System.out.println("sandauga " + skaiciuotuvas.sandauga(a, b));
    }
    static float a;
    static float b;

    public static void ivedimas(){
        System.out.println("iveskite du skaicius");
        Scanner sc = new Scanner(System.in);
        a= sc.nextFloat();
        b= sc.nextFloat();

    }
}








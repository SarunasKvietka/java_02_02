package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite svori");
        Scanner sc = new Scanner(System.in);
        float svoris = sc.nextInt();
        System.out.println("iveskite ugi");
        float ugis = sc.nextFloat();
        float Kmi = svoris / (ugis * ugis);
        System.out.println("jusu indeksas" + Kmi);
    }
}








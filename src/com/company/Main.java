package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("iveskite nuvaziuota atstuma");
        Scanner sc = new Scanner(System.in);
        float atstumas = sc.nextFloat();
        System.out.println("iveskite sunaudota degalu kieki");
        float kiekis = sc.nextFloat();
        float vidurkis = (kiekis * 100)/atstumas;
        System.out.println("jusu kuro sanaudos100"+ vidurkis);



    }
}








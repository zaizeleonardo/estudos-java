package com.leo;

import java.util.Scanner;

public class Tabuada {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();

       for(int i = 1; i <= 10; i++){
           int  resultado = n1 * i;
           System.out.println(n1 + " x " + i + " = " + resultado);
       }
        sc.close();
        }


}
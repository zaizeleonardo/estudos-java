
package com.leo;

import java.util.Scanner;

public class MaiorIdade {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("BEM VINDO AO SISTEMA BANCARIO");


        double saldo = 500;
        System.out.println("Digite o valor do Saque: ");
        double valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println(" Valor inválido");

        } else if (valor > saldo){
            System.out.println(" Saldo Insuficiente");
        }else {
            System.out.println("Saque Realizado! Saldo restante: " + (saldo - valor));
        }
        sc.close();
    }

}

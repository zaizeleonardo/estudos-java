package com.leo;

import java.util.Scanner;

public class CaixaEletronico {
    static void main() {

        System.out.println("BEM VINDO AO SISTEMA BANCARIO");

        Scanner sc = new Scanner(System.in);

        double saldo = 500;
        System.out.println("Digite o valor do Saque: ");
        double valor = sc.nextDouble();

        if(valor <= 0) {
            System.out.println("Valor inválido");

        }else if(valor > saldo) {
            System.out.println(" Saldo insulficiente");

        } else{
                System.out.println("Saque realizado com sucesso! Saldo restante: "+ (saldo - valor ));
            }
        sc.close();
        }

    }




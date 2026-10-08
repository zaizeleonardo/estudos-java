package com.leo;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Bem vindo a sua conta bancária");

        Scanner sc = new Scanner(System.in);
        System.out.println("1 - Saldo");
        System.out.println("2 - Extrato");
        System.out.println("3 - Saque");
        System.out.println("4 - Sair");

        int opcao = sc.nextInt();

        switch(opcao){
            case 1:
                System.out.print("Você escolheu Saldo");
                break;
            case 2:
                System.out.print("Você escolheu Extrato");
                break;
            case 3:
                System.out.print("Você escolheu Saque");
                break;
            case 4:
                System.out.print("saindo");
                break;
            default:
                System.out.print("Opção inválida");
        }
    sc.close();
    }
}


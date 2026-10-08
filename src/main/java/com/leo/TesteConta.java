package com.leo;

public class TesteConta {
    static void main() {
         ContaBancaria conta1 = new ContaBancaria ("Leonardo Zaize");
         ContaBancaria conta2 = new ContaBancaria("Ana Paula Zaize");

        conta1.depositar(1000);
        conta2.depositar(300);
        conta1.depositar(-500);

        conta1.sacar(200);
        conta2.sacar(500);
        conta1.sacar(-50);

        conta1.transferir(300, conta2);
        conta2.transferir(50, conta1);
        conta1.transferir(10, conta2);

        conta1.mostrarSaldo();
        conta2.mostrarSaldo();


        System.out.println("Saldo da conta 1: " + conta1.getSaldo());
    }
}



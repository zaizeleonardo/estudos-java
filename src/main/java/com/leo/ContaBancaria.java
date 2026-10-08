package com.leo;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Valor inválido");
        } else {
            saldo = valor + saldo;
            System.out.println("Depósito de R$ " + valor + " realizado");
        }
    }
        public void sacar ( double valor){
            if (valor <= 0) {
                System.out.println("Valor inválido");
            } else if (valor > saldo) {
                System.out.println("Saldo insuficiente");
            } else {
                saldo = saldo - valor;
                System.out.println("Saque realizado com sucesso! Saldo restante: R$ " + saldo);
            }
        }

        public void transferir (double valor, ContaBancaria destino){
            if (valor <= 0) {
                System.out.println("Valor inválido");
            }else if(valor > saldo){
                System.out.println("Saldo insuficiente");
            }else{
                saldo = saldo - valor;
                destino.depositar(valor);
                System.out.println("Transferência realizada com sucesso.");
            }

        }
        public void mostrarSaldo () {
            System.out.println(titular + " - saldo: R$ " + saldo);
        }

        public String getTitular () {
            return titular;
        }
        public double getSaldo () {
            return saldo;
        }
    }


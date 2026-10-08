package com.leo;

public class Carro {
    String modelo;
    int velocidade;

    public Carro(String modelo) {
        this.modelo = modelo;
        this.velocidade = 0;
    }

    public void acelerar(int valor){
        velocidade = velocidade + valor;
        System.out.println(modelo + "acelerou para " + velocidade + " km/h");
    }
    }

package com.leo;

import java.util.ArrayList;

public class Banco {

   private ArrayList<ContaBancaria> contas = new ArrayList<>();

   public void adicionarConta(ContaBancaria conta) {
      contas.add(conta);
   }

   public void listarContas() {
      for (ContaBancaria conta : contas) {
         conta.mostrarSaldo();
      }
   }
}
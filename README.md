# Estudos de Java

Repositório com meus estudos de Java durante a transição de carreira
do setor bancário para o desenvolvimento back-end.

## Sistema Bancário

Simulação de contas bancárias com as operações principais de um banco:

- Depósito, saque e transferência entre contas
- Validação de valores inválidos (zero ou negativos)
- Bloqueio de saque e transferência sem saldo suficiente
- Saldo protegido por encapsulamento: só muda por depósito, saque ou transferência

Arquivos: `ContaBancaria.java` (a classe) e `TesteConta.java` (os testes).

## Exercícios de lógica

- `CaixaEletronico`: saque com validações usando if / else if / else
- `Tabuada`: tabuada de qualquer número com for
- `Par`: números pares e soma com for e operador %
- `MaiorIdade`: classificação por idade com if / else if

## Conceitos praticados

Variáveis e tipos, Scanner, estruturas de decisão, laços de repetição,
classes e objetos, construtores, métodos, encapsulamento (private e getters)
e objetos como parâmetro.

## Como executar

Requer Java 21 ou superior. Abra o projeto no IntelliJ IDEA e execute
o método `main` de qualquer classe, por exemplo `TesteConta`.

## Próximos passos

- Classe Banco com lista de contas (ArrayList)
- Tratamento de exceções
- Testes unitários com JUnit

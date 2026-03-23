/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 15

Enunciado:
Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio15 {  
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double cotacaoDolar, quantidadeDolar, valorReais;

            // Entrada de dados
            System.out.print("Digite a cotação do dólar: ");
            cotacaoDolar = teclado.nextDouble();

            System.out.print("Digite a quantidade de dólares: ");
            quantidadeDolar = teclado.nextDouble();

            // Cálculo
            valorReais = cotacaoDolar * quantidadeDolar;

            // Saída
            System.out.println("O valor correspondente em Reais é: R$ " + valorReais);

        }
    }
}
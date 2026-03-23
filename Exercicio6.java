/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 06

Enunciado:
Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double valor1, valor2, valor3, valor4, media;

            // Entrada de dados
            System.out.print("Digite o primeiro valor: ");
            valor1 = teclado.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = teclado.nextDouble();

            System.out.print("Digite o terceiro valor: ");
            valor3 = teclado.nextDouble();

            System.out.print("Digite o quarto valor: ");
            valor4 = teclado.nextDouble();

            // Cálculo
            media = (valor1 + valor2 + valor3 + valor4) / 4;

            // Saída
            System.out.println("A média aritmética dos quatro valores é: " + media);

        }
    }
}
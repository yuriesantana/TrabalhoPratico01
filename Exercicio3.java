/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 03

Enunciado:
Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double diagonal, area;

            // Entrada de dados
            System.out.print("Digite o valor da diagonal do quadrado: ");
            diagonal = teclado.nextDouble();

            // Cálculo
            area = Math.pow(diagonal, 2) / 2;

            // Saída
            System.out.println("A área do quadrado é: " + area);

        }
    }
}
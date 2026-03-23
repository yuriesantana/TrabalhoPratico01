/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 02

Enunciado:
Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double aresta, area;

            // Entrada de dados
            System.out.print("Digite o valor da aresta do quadrado: ");
            aresta = teclado.nextDouble();

            // Cálculo
            area = Math.pow(aresta, 2);

            // Saída
            System.out.println("A área do quadrado é: " + area);

        }
    }
}
/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 07

Enunciado:
Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double valor1, valor2, mediaGeometrica;

            // Entrada de dados
            System.out.print("Digite o primeiro valor: ");
            valor1 = teclado.nextDouble();

            System.out.print("Digite o segundo valor: ");
            valor2 = teclado.nextDouble();

            // Cálculo
            mediaGeometrica = Math.sqrt(valor1 * valor2);

            // Saída
            System.out.println("A média geométrica dos dois valores é: " + mediaGeometrica);

        }
    }
}
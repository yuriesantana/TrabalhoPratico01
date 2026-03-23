/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 04

Enunciado:
A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double base, altura, area;

            // Entrada de dados
            System.out.print("Digite a base do triângulo: ");
            base = teclado.nextDouble();

            System.out.print("Digite a altura do triângulo: ");
            altura = teclado.nextDouble();

            // Cálculo
            area = (base * altura) / 2;

            // Saída
            System.out.println("A área do triângulo é: " + area);

        }
    }
}
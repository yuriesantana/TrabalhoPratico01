/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 11

Enunciado:
A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double diametro, raio, area;

            // Entrada de dados
            System.out.print("Digite o valor do diâmetro do círculo: ");
            diametro = teclado.nextDouble();

            // Cálculo
            raio = diametro / 2;
            area = Math.PI * Math.pow(raio, 2);

            // Saída
            System.out.println("A área do círculo é: " + area);

        }
    }
}
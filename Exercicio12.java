/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 12

Enunciado:
Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double altura, raio, volume;

            // Entrada de dados
            System.out.print("Digite a altura do cone: ");
            altura = teclado.nextDouble();

            System.out.print("Digite o raio da base do cone: ");
            raio = teclado.nextDouble();

            // Cálculo
            volume = (Math.PI * Math.pow(raio, 2) * altura) / 3;

            // Saída
            System.out.println("O volume do cone é: " + volume);

        }
    }
}
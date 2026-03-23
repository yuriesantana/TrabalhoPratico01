/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 05

Enunciado:
Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double diametro, raio, volume;

            // Entrada de dados
            System.out.print("Digite o valor do diâmetro da esfera: ");
            diametro = teclado.nextDouble();

            // Cálculo
            raio = diametro / 2;
            volume = (4/3) * Math.PI * Math.pow(raio, 3);

            // Saída
            System.out.println("O volume da esfera é: " + volume);

        }
    }
}
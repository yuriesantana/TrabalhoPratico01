/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 14

Enunciado:
Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
“r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão
digitados.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double raio, aresta, volumeLivre, volumeEsfera, volumeCubo;

            // Entrada de dados
            System.out.print("Digite o valor do raio da esfera: ");
            raio = teclado.nextDouble();

            System.out.print("Digite o valor da aresta do cubo: ");
            aresta = teclado.nextDouble();

            // Cálculo
            volumeEsfera = (4/3) * Math.PI * Math.pow(raio, 3);
            volumeCubo = Math.pow(aresta, 3);
            volumeLivre = volumeCubo - volumeEsfera;

            // Saída
            System.out.println("O volume livre do ambiente é: " + volumeLivre);

        }
    }
}
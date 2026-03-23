/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 08

Enunciado:
Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double milhasMaritimas, quilometros;

            // Entrada de dados
            System.out.print("Digite o valor em milhas marítimas: ");
            milhasMaritimas = teclado.nextDouble();

            // Cálculo
            quilometros = (milhasMaritimas * 1852) / 1000;

            // Saída
            System.out.println(milhasMaritimas + " milhas marítimas equivalem a " + quilometros + " quilômetros.");

        }
    }
}
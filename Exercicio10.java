/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 10

Enunciado:
Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double celsius, fahrenheit;

            // Entrada de dados
            System.out.print("Digite a temperatura em graus Celsius: ");
            celsius = teclado.nextDouble();

            // Cálculo
            fahrenheit = (celsius * 9 / 5) + 32;

            // Saída
            System.out.println("A temperatura equivalente em Fahrenheit é: " + fahrenheit);

        }
    }
}
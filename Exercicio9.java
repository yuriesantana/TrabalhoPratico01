/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 09

Enunciado:
Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double resistencia, corrente, tensao;

            // Entrada de dados
            System.out.print("Digite o valor da resistência (em ohms): ");
            resistencia = teclado.nextDouble();

            System.out.print("Digite o valor da corrente elétrica (em amperes): ");
            corrente = teclado.nextDouble();

            // Cálculo
            tensao = resistencia * corrente;

            // Saída
            System.out.println("A tensão do circuito é: " + tensao + " volts");

        }
    }
}

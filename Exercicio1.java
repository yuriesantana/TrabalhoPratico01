/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 01

Enunciado:
Entrar via teclado com a base e a altura de um retângulo, 
calcular e exibir sua área.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double base, altura, area;

            // Entrada de dados
            System.out.print("Digite a base do retângulo: ");
            base = teclado.nextDouble();

            System.out.print("Digite a altura do retângulo: ");
            altura = teclado.nextDouble();

            // Cálculo
            area = base * altura;

            // Saída
            System.out.println("A área do retângulo é: " + area);

        }
    }
}

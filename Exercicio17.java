/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 17

Enunciado:
Entrar via teclado com dois valores quaisquer “X” e “Y”. Calcular e exibir o
cálculo XY (“X” elevado a “Y”). Pesquisar as funções Exp e Ln.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {

        try (Scanner teclado = new Scanner(System.in)) {

            double x, y, resultado;

            // Entrada
            System.out.print("Digite o valor de X: ");
            x = teclado.nextDouble();

            System.out.print("Digite o valor de Y: ");
            y = teclado.nextDouble();

            // Cálculo usando exp e ln
            resultado = Math.exp(y * Math.log(x));

            // Saída
            System.out.println("Resultado de X^Y = " + resultado);

        }
    }
}
/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 16

Enunciado:
Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double anguloGraus, anguloRadianos, seno, cosseno, tangente, secante;

            // Entrada de dados
            System.out.print("Digite o valor do ângulo em graus: ");
            anguloGraus = teclado.nextDouble();

            // Conversão para radianos
            anguloRadianos = Math.toRadians(anguloGraus);

            // Cálculo das funções trigonométricas
            seno = Math.sin(anguloRadianos);
            cosseno = Math.cos(anguloRadianos);
            tangente = Math.tan(anguloRadianos);
            secante = 1 / cosseno;

            // Saída
            System.out.println("Seno: " + seno);
            System.out.println("Cosseno: " + cosseno);
            System.out.println("Tangente: " + tangente);
            System.out.println("Secante: " + secante);

        }
    }
}
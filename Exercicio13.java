/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 13

Enunciado:
Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;
public class Exercicio13 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double velocidadeInicial, aceleracao, tempo, velocidadeFinal;

            // Entrada de dados
            System.out.print("Digite a velocidade inicial do automóvel (em m/s): ");
            velocidadeInicial = teclado.nextDouble();

            System.out.print("Digite a aceleração do automóvel (em m/s²): ");
            aceleracao = teclado.nextDouble();

            System.out.print("Digite o tempo de percurso (em segundos): ");
            tempo = teclado.nextDouble();

            // Cálculo
            velocidadeFinal = velocidadeInicial + (aceleracao * tempo);
            velocidadeFinal = velocidadeFinal * 3.6; // Convertendo de m/s para km/h

            // Saída
            System.out.println("A velocidade final do automóvel é: " + velocidadeFinal + " km/h");

        }
    }
}
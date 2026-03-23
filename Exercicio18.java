/*
TRABALHO PRÁTICO 01 - EXERCÍCIO 18

Enunciado:
Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.

Dupla:
- Yuri Mendes (CB3038122)
- Gabriel Batalha (CB3038076)
 */

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {

            double produto1, produto2, produto3, produto4, produto5;
            double pagamento, troco;

            // Entrada de dados
            System.out.print("Digite o valor do primeiro produto: ");
            produto1 = teclado.nextDouble();

            System.out.print("Digite o valor do segundo produto: ");
            produto2 = teclado.nextDouble();

            System.out.print("Digite o valor do terceiro produto: ");
            produto3 = teclado.nextDouble();

            System.out.print("Digite o valor do quarto produto: ");
            produto4 = teclado.nextDouble();

            System.out.print("Digite o valor do quinto produto: ");
            produto5 = teclado.nextDouble();

            System.out.print("Digite o valor do pagamento: ");
            pagamento = teclado.nextDouble();

            // Cálculo
            double total = produto1 + produto2 + produto3 + produto4 + produto5;
            troco = pagamento - total;

            // Saída
            System.out.println("O troco a ser devolvido é: " + troco);

        }
    }
}
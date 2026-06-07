/*
 * Exercício 02
 *
 * Enunciado:
 * Escreva um programa que receba dois números inteiros
 * e exiba na tela:
 * - A soma
 * - A subtração
 * - A multiplicação
 * - A divisão
 *
 * Exemplo de entrada:
 * Primeiro número: 10
 * Segundo número: 2
 *
 * Exemplo de saída:
 * Soma: 12
 * Subtração: 8
 * Multiplicação: 20
 * Divisão: 5
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número (exemplo: 10): ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número (exemplo: 2): ");
        int numero2 = scanner.nextInt();

        // Cálculos
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        int divisao = numero1 / numero2;

        // Saída
        System.out.println("\nResultados:");
        System.out.println("Soma: " + soma);
        System.out.println("Subtração: " + subtracao);
        System.out.println("Multiplicação: " + multiplicacao);
        System.out.println("Divisão: " + divisao);

        scanner.close();
    }
}

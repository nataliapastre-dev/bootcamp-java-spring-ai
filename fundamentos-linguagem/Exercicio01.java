/*
 * Exercício 01
 *
 * Enunciado:
 * Escreva um programa que receba o nome e o ano de nascimento
 * de uma pessoa e exiba uma mensagem informando sua idade.
 *
 * Exemplo de entrada:
 * Nome: Natália
 * Ano de nascimento: 1991
 *
 * Exemplo de saída:
 * Olá Natália, você tem 35 anos.
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita o nome
        System.out.print("Digite seu nome (exemplo: Natália): ");
        String nome = scanner.nextLine();

        // Solicita o ano de nascimento
        System.out.print("Digite seu ano de nascimento (exemplo: 1991): ");
        int anoNascimento = scanner.nextInt();

        // Calcula a idade
        int idade = 2026 - anoNascimento;

        // Exibe o resultado
        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        // Fecha o Scanner
        scanner.close();
    }
}

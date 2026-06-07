/*
 * Exercício 03
 *
 * Enunciado:
 * Escreva um programa que receba duas notas de um aluno,
 * calcule a média e exiba o resultado na tela.
 *
 * Exemplo de entrada:
 * Primeira nota: 8.5
 * Segunda nota: 7.5
 *
 * Exemplo de saída:
 * Média: 8.0
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a primeira nota
        System.out.print("Digite a primeira nota (exemplo: 8.5): ");
        double nota1 = scanner.nextDouble();

        // Solicita a segunda nota
        System.out.print("Digite a segunda nota (exemplo: 7.5): ");
        double nota2 = scanner.nextDouble();

        // Calcula a média
        double media = (nota1 + nota2) / 2;

        // Exibe o resultado
        System.out.println("Média: " + media);

        // Fecha o Scanner
        scanner.close();
    }
}

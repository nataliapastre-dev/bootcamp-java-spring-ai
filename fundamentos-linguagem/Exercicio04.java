/*
 * Exercício 04
 *
 * Enunciado:
 * Escreva um programa que receba a base e a altura de um retângulo,
 * calcule sua área e exiba o resultado na tela.
 *
 * Fórmula:
 * área = base * altura
 *
 * Exemplo de entrada:
 * Base: 5
 * Altura: 4
 *
 * Exemplo de saída:
 * Área do retângulo: 20.0
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita a base
        System.out.print("Digite a base do retângulo (exemplo: 5): ");
        double base = scanner.nextDouble();

        // Solicita a altura
        System.out.print("Digite a altura do retângulo (exemplo: 4): ");
        double altura = scanner.nextDouble();

        // Calcula a área
        double area = base * altura;

        // Exibe o resultado
        System.out.println("Área do retângulo: " + area);

        // Fecha o Scanner
        scanner.close();
    }
}

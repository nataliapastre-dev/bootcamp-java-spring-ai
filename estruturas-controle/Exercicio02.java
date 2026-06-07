/*
 * Exercício 02
 *
 * Enunciado:
 * Escreva um código onde o usuário entra com sua altura e peso,
 * seja feito o cálculo do IMC:
 *
 * IMC = peso / (altura * altura)
 *
 * E seja exibida uma mensagem de acordo com o resultado:
 *
 * IMC <= 18.5                -> Abaixo do peso
 * IMC entre 18.6 e 24.9      -> Peso ideal
 * IMC entre 25.0 e 29.9      -> Levemente acima do peso
 * IMC entre 30.0 e 34.9      -> Obesidade Grau I
 * IMC entre 35.0 e 39.9      -> Obesidade Grau II (Severa)
 * IMC >= 40.0                -> Obesidade III (Mórbida)
 *
 * Exemplo de entrada:
 * Altura: 1.65
 * Peso: 70
 *
 * Exemplo de saída:
 * Seu IMC é: 25.71
 * Classificação: Levemente acima do peso
 */

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicita a altura
        System.out.print("Digite sua altura em metros (exemplo: 1.65): ");
        double altura = scanner.nextDouble();

        // Solicita o peso
        System.out.print("Digite seu peso em kg (exemplo: 70): ");
        double peso = scanner.nextDouble();

        // Calcula o IMC
        double imc = peso / (altura * altura);

        // Exibe o IMC
        System.out.printf("Seu IMC é: %.2f%n", imc);

        // Classificação
        if (imc <= 18.5) {
            System.out.println("Classificação: Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Classificação: Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Classificação: Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Classificação: Obesidade Grau I");
        } else if (imc <= 39.9) {
            System.out.println("Classificação: Obesidade Grau II (Severa)");
        } else {
            System.out.println("Classificação: Obesidade III (Mórbida)");
        }

        scanner.close();
    }
}

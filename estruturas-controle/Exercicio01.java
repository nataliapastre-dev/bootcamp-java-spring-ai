/*
 * Exercício 01
 *
 * Enunciado:
 * Escreva um código onde o usuário entra com um número
 * e seja gerada a tabuada de 1 até 10 desse número.
 *
 * Exemplo de entrada:
 * Número: 5
 *
 * Exemplo de saída:
 * 5 x 1 = 5
 * 5 x 2 = 10
 * 5 x 3 = 15
 * 5 x 4 = 20
 * 5 x 5 = 25
 * 5 x 6 = 30
 * 5 x 7 = 35
 * 5 x 8 = 40
 * 5 x 9 = 45
 * 5 x 10 = 50
 */

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        // Cria o Scanner para ler dados digitados pelo usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita um número
        System.out.print("Digite um número (exemplo: 5): ");
        int numero = scanner.nextInt();

        System.out.println("\nTabuada do " + numero + ":");

        // Gera a tabuada de 1 até 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // Fecha o Scanner
        scanner.close();
    }
}

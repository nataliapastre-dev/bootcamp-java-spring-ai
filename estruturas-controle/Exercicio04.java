/*
 * Exercício 04
 *
 * Enunciado:
 * O usuário informa um número inicial.
 * Em seguida informa outros números.
 *
 * A execução continua enquanto o número informado,
 * dividido pelo primeiro número, tiver resto 0.
 *
 * Números menores que o primeiro número devem ser ignorados.
 */

import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial (exemplo: 10): ");
        int numeroInicial = scanner.nextInt();

        boolean continuar = true;

        while (continuar) {

            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();

            // Ignora números menores que o inicial
            if (numero < numeroInicial) {
                System.out.println("Número ignorado.");
                continue;
            }

            // Verifica o resto da divisão
            if (numero % numeroInicial != 0) {
                continuar = false;
                System.out.println("Resto diferente de 0. Encerrando programa.");
            }
        }

        scanner.close();
    }
}

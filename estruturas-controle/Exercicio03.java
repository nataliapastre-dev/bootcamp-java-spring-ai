/*
 * Exercício 03
 *
 * Enunciado:
 * O usuário deve informar:
 * - Um primeiro número
 * - Um segundo número maior que o primeiro
 * - A opção PAR ou IMPAR
 *
 * O programa deve exibir todos os números pares ou ímpares
 * dentro do intervalo informado, incluindo os números digitados,
 * em ordem decrescente.
 *
 * Exemplo:
 *
 * Primeiro número: 10
 * Segundo número: 20
 * Opção: PAR
 *
 * Saída:
 * 20
 * 18
 * 16
 * 14
 * 12
 * 10
 */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número (exemplo: 10): ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        System.out.print("Digite PAR ou IMPAR: ");
        String opcao = scanner.next();

        System.out.println("\nResultado:");

        for (int i = segundoNumero; i >= primeiroNumero; i--) {

            if (opcao.equalsIgnoreCase("PAR")) {

                if (i % 2 == 0) {
                    System.out.println(i);
                }

            } else if (opcao.equalsIgnoreCase("IMPAR")) {

                if (i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }

        scanner.close();
    }
}

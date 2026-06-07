public class Main {
    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria(600);

        System.out.println("💰 Saldo inicial: R$ " + conta.consultarSaldo());
        System.out.println("🏦 Cheque especial: R$ " + conta.consultarChequeEspecial());

        conta.sacar(700);
        System.out.println("\n💸 Após saque:");
        System.out.println("Saldo: R$ " + conta.consultarSaldo());
        System.out.println("Cheque especial restante: R$ " + conta.consultarChequeEspecial());
        System.out.println("Usando cheque especial? " + conta.estaUsandoChequeEspecial());

        conta.depositar(200);

        System.out.println("\n💰 Após depósito:");
        System.out.println("Saldo: R$ " + conta.consultarSaldo());
        System.out.println("Cheque especial restante: R$ " + conta.consultarChequeEspecial());

        conta.pagarBoleto(50);

        System.out.println("\n💳 Após pagar boleto:");
        System.out.println("Saldo: R$ " + conta.consultarSaldo());
    }
}

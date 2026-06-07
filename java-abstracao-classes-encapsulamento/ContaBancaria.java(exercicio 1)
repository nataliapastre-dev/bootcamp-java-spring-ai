
public class ContaBancaria {

    private double saldo;
    private double limiteChequeEspecial;
    private double chequeEspecialUsado;
    private boolean usandoChequeEspecial;

    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;

        if (depositoInicial <= 500) {
            this.limiteChequeEspecial = 50.0;
        } else {
            this.limiteChequeEspecial = depositoInicial * 0.5;
        }

        this.chequeEspecialUsado = 0;
        this.usandoChequeEspecial = false;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public double consultarChequeEspecial() {
        return limiteChequeEspecial - chequeEspecialUsado;
    }

    public boolean estaUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void sacar(double valor) {
        if (valor <= 0) return;

        if (saldo >= valor) {
            saldo -= valor;
        } else {
            double falta = valor - saldo;

            if (falta <= (limiteChequeEspecial - chequeEspecialUsado)) {
                saldo = 0;
                chequeEspecialUsado += falta;
                usandoChequeEspecial = true;
            } else {
                System.out.println("❌ Saldo insuficiente.");
                return;
            }
        }
    }

    public void depositar(double valor) {
        if (valor <= 0) return;

        saldo += valor;

        // cobrança de taxa se estiver usando cheque especial
        if (chequeEspecialUsado > 0) {
            double taxa = chequeEspecialUsado * 0.2;
            chequeEspecialUsado += taxa;

            System.out.println("⚠ Taxa de 20% aplicada: R$ " + taxa);
        }

        if (chequeEspecialUsado == 0) {
            usandoChequeEspecial = false;
        }
    }

    public void pagarBoleto(double valor) {
        System.out.println("💳 Pagando boleto de R$ " + valor);
        sacar(valor);
    }
}

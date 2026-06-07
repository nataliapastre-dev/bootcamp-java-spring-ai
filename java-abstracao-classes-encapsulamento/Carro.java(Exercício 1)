public class Carro {

    private boolean ligado = false;
    private int velocidade = 0;
    private int marcha = 0;

    // 🔹 Ligar carro
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("🚗 Carro ligado.");
        }
    }

    // 🔹 Desligar carro
    public void desligar() {
        if (velocidade == 0 && marcha == 0) {
            ligado = false;
            System.out.println("🔌 Carro desligado.");
        } else {
            System.out.println("❌ Não é possível desligar em movimento!");
        }
    }

    // 🔹 Acelerar
    public void acelerar() {
        if (!ligado) return;

        if (velocidade < 120) {
            velocidade++;
            System.out.println("🚀 Velocidade: " + velocidade + " km/h");
        }
    }

    // 🔹 Desacelerar
    public void desacelerar() {
        if (!ligado) return;

        if (velocidade > 0) {
            velocidade--;
            System.out.println("🐢 Velocidade: " + velocidade + " km/h");
        }
    }

    // 🔹 Trocar marcha
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) return;

        if (novaMarcha == marcha + 1 || novaMarcha == marcha - 1) {
            marcha = novaMarcha;
            System.out.println("⚙ Marcha atual: " + marcha);
        } else {
            System.out.println("❌ Não pode pular marchas!");
        }
    }

    // 🔹 Virar
    public void virar(String direcao) {
        if (!ligado) return;

        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("↩ Virando para a " + direcao);
        } else {
            System.out.println("❌ Não é seguro virar nessa velocidade!");
        }
    }

    // 🔹 Ver velocidade
    public void verVelocidade() {
        System.out.println("📊 Velocidade atual: " + velocidade + " km/h");
    }

    // 🔹 Getters opcionais
    public int getVelocidade() {
        return velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public boolean isLigado() {
        return ligado;
    }
}

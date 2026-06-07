public class Biblioteca {

    private String titulo;
    private String autor;
    private boolean emprestado;

    public Biblioteca(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.emprestado = false;
    }

    // 📖 Emprestar livro
    public void emprestarLivro() {
        if (emprestado) {
            System.out.println("❌ Livro já está emprestado.");
        } else {
            emprestado = true;
            System.out.println("📚 Livro emprestado com sucesso!");
        }
    }

    // 📖 Devolver livro
    public void devolverLivro() {
        if (!emprestado) {
            System.out.println("❌ Livro já está disponível.");
        } else {
            emprestado = false;
            System.out.println("📚 Livro devolvido com sucesso!");
        }
    }

    // 📖 Verificar status
    public void verificarStatus() {
        if (emprestado) {
            System.out.println("📕 Status: Emprestado");
        } else {
            System.out.println("📗 Status: Disponível");
        }
    }

    // 📖 Exibir informações
    public void exibirInfo() {
        System.out.println("📘 Título: " + titulo);
        System.out.println("✍ Autor: " + autor);
        verificarStatus();
    }
}

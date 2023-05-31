abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // método que aceita o visitor
    public abstract void accept(Visitor visitor);
}
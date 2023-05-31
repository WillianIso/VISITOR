class Desenvolvedor extends Funcionario {
    private double salario;

    public Desenvolvedor(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
class Gerente extends Funcionario {
    private double salario;

    public Gerente(String nome, double salario) {
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
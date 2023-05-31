class CalculadoraSalarioVisitor implements Visitor {
    private double salarioTotal;

    @Override
    public void visit(Gerente gerente) {
        salarioTotal += gerente.getSalario();
    }

    @Override
    public void visit(Desenvolvedor desenvolvedor) {
        salarioTotal += desenvolvedor.getSalario();
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }
}
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VisitorTest {

    @Test
    public void testCalculadoraSalarioVisitor() {
        Funcionario gerente1 = new Gerente("João", 5000);
        Funcionario gerente2 = new Gerente("Maria", 6000);
        Funcionario desenvolvedor1 = new Desenvolvedor("Pedro", 4000);
        Funcionario desenvolvedor2 = new Desenvolvedor("Ana", 4500);

        CalculadoraSalarioVisitor calculadoraSalarioVisitor = new CalculadoraSalarioVisitor();

        gerente1.accept(calculadoraSalarioVisitor);
        gerente2.accept(calculadoraSalarioVisitor);
        desenvolvedor1.accept(calculadoraSalarioVisitor);
        desenvolvedor2.accept(calculadoraSalarioVisitor);

        double salarioTotal = calculadoraSalarioVisitor.getSalarioTotal();
        assertEquals(19500, salarioTotal, 0);
    }
}

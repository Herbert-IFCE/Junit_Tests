package Introducao_Junit;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestCalculadora {

    @Test
    public void testSomarPares() {
        Calculadora c1 = new Calculadora();
        int a = 2;
        int b = 2;
        int resultado = a+b;
        System.out.println("resultado: "+resultado);
        assertEquals(resultado, c1.somar(a, b));
    }

    @Test
    public void testSomarImpares() {
        Calculadora c1 = new Calculadora();
        int a = 3;
        int b = 5;
        int resultado = a+b;
        System.out.println("resultado: "+resultado);
        assertEquals(resultado, c1.somar(a, b));
    }

    @Test
    public void testDivisao() {
        Calculadora c1 = new Calculadora();
        float a = 10;
        float b = 2;
        assertTrue(b>0);
        float resultado = a/b;
        System.out.println("resultado: "+resultado);
        assertEquals(resultado, c1.divisao(a, b), resultado);
    }
}
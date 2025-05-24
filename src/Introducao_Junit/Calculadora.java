package Introducao_Junit;

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public float divisao(float a, float b) {
        if (b == 0) return 0;
        return a/b;
    }
}
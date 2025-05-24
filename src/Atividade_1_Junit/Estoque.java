package Atividade_1_Junit;

public class Estoque {
    private int quantidadeProdutos;

    public Estoque(int quantidade) {
        if (verificarNegativo(quantidade)) {
            this.quantidadeProdutos = quantidade;
        }
        System.out.println("O estoque não pode ser negativo");
        this.quantidadeProdutos = 0;
    }

    public boolean verificarNegativo(int q) {
        if (q > 0) {
            return true;
        }
        return false;
    }

    public int getEstoque(){
        return this.quantidadeProdutos;
    }

    public void aumentarEstoque(int quant) {
        this.quantidadeProdutos += quant;
    }

    public void diminuirEstoque(int quant) {
        this.quantidadeProdutos -= quant;
        if (this.quantidadeProdutos < 0) {
            this.quantidadeProdutos = 0;
        }
    }
}

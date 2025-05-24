package Atividade_1_Junit;
import java.util.ArrayList;

public class Produto extends Estoque {

    private String precoProduto;
    private String nomeProduto;
    private String statusProduto;

    public Produto(String preco, String nome, String status, int estoque) {
        super(estoque);
        this.precoProduto = preco;
        this.nomeProduto = nome;
        this.statusProduto = status;
        this.verificar();
    }

    public ArrayList<String> getDados() {
        ArrayList<String> dados = new ArrayList<>();
        dados.add(this.precoProduto);
        dados.add(this.nomeProduto);
        dados.add(this.statusProduto);

        return dados;
    }

    public void verificar() {
        if (this.precoProduto == "") {
            this.statusProduto = "inativo";
        }
    }
}

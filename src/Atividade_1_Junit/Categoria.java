package Atividade_1_Junit;

import Atividade_1_Junit.Produto;

import java.util.ArrayList;

public class Categoria {

    private String nomeCategoria;
    private String descricaoCategoria;
    private ArrayList<Produto> produtos;

    public Categoria(String nome, String descricao) {
        this.nomeCategoria = nome;
        this.descricaoCategoria = descricao;
        this.produtos = new ArrayList();
    }

    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
}

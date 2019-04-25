package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Livraria {
    //Atributo
    private String nome;
    private String colecoes;
    private int quantLivros;
    ArrayList<Livro> livros;

    //Construtor

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getColecoes() {
        return colecoes;
    }

    public void setColecoes(String colecoes) {
        this.colecoes = colecoes;
    }

    public int getQuantLivros() {
        return quantLivros;
    }

    public void setQuantLivros(int quantLivros) {
        this.quantLivros = quantLivros;
    }
}
}

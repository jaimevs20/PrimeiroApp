package com.example.primeiroapp.exemplo5;

import com.example.primeiroapp.R;

import java.util.ArrayList;
import java.util.List;

public class Planeta {
    private String nome;
    private int imagem;

    public Planeta(String nome, int imagem) {
        this.nome = nome;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public static List<Planeta> getPlanetas(){
        List<Planeta>planetas = new ArrayList<>();

        planetas.add(new Planeta("Mercurio", R.drawable.esfera));
        planetas.add(new Planeta("Vênus", R.drawable.esfera));
        planetas.add(new Planeta("Terra", R.drawable.esfera));
        planetas.add(new Planeta("Marte", R.drawable.esfera));
        planetas.add(new Planeta("Júpiter", R.drawable.esfera));
        planetas.add(new Planeta("Saturno", R.drawable.esfera));
        planetas.add(new Planeta("Urano", R.drawable.esfera));
        planetas.add(new Planeta("Netuno", R.drawable.esfera));
        planetas.add(new Planeta("Plutão", R.drawable.esfera));

        return planetas;
    }
}

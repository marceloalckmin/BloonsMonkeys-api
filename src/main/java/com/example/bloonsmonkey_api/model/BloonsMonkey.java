package com.example.bloonsmonkey_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class BloonsMonkey {
    private @Id @GeneratedValue Long id;
    private String name;
    private String descricao;
    private String tipo;
    private int dano;

    public BloonsMonkey(){}

    public BloonsMonkey(String name, String descricao, String tipo, int dano){
        this.name = name;
        this.descricao = descricao;
        this.tipo = tipo;
        this.dano = dano;
    }

    public String getName(){
        return this.name;
    }

    public String getTipo(){
        return this.tipo;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public int getDano(){
        return this.dano;
    }

    public void setNome(String name){
        this.name = name;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setDano(int dano){
        this.dano = dano;
    }

    @Override
    public String toString(){
        return "BloonsMonkey{" + "id=" + this.id + "name=" + this.name + "descricao=" + this.descricao + "tipo=" + this.tipo + "dano=" + this.dano + "}";
    }

}

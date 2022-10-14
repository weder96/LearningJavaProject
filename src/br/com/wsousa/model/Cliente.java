package br.com.wsousa.model;

public class Cliente implements Autenticavel {

    private int senha;

    public Cliente (int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

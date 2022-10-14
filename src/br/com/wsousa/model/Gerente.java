package br.com.wsousa.model;

public class Gerente extends Funcionario implements Autenticavel {

    private int senha;

    public Gerente (int senha) {
        this.senha = senha;
    }

    @Override
    public boolean autentica(int senha) {
        return this.senha == senha;
    }
}

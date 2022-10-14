package br.com.wsousa.model;

public abstract class Funcionario {
    private int senha;

    public boolean autentica(int senha) {
        int minhaSenha = 777;
        return minhaSenha == senha;
    }

    public Integer getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}

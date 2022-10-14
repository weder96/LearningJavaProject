package br.com.wsousa.model;

public class Diretor extends Funcionario implements Autenticavel {
        private int senha;

        public Diretor (int senha) {
            this.senha = senha;
        }

        @Override
        public boolean autentica(int senha){
            return this.senha  == senha;
        }
}

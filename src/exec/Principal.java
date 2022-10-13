package exec;

import br.com.yohana.model.*;

public class Principal {
    public static void main(String[] args) {

        SistemaInterno sistema = new SistemaInterno();

        Autenticavel gerente = new Gerente (789);
        System.out.println("Senha gerente: "+ sistema.login(gerente, 789));

        Autenticavel gerente2 = new Gerente (111);
        System.out.println("Senha gerente: "+ sistema.login(gerente2, 789));

        Autenticavel diretor = new Diretor (456);
        System.out.println("Senha diretor: "+ sistema.login(diretor, 456));

        Autenticavel cliente = new Cliente (123);
        System.out.println("Senha cliente: "+ sistema.login(cliente, 123));
    }
}
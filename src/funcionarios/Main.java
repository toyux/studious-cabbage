package funcionarios;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var Funcionarios = new ArrayList<Funcionario>();

        Funcionarios.add(new Concursado("Joao",4000,5));
        Funcionarios.add(new Temporario("Jose",2000,12));
        Funcionarios.add(new Concursado("Maria",2400,34));
        Funcionarios.add(new Temporario("Pedro",1200,10));

        for (var funcionario : Funcionarios) {
            //System.out.println(funcionario.imprimir());
            funcionario.imprimir();
        }
    }
}
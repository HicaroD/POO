package exercicio10;

import java.util.ArrayList;

public class Sistema {
    ArrayList<Funcionario> funcionarios;

    public Sistema() {
        this.funcionarios = new ArrayList<>();
    }

    void addFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }
}

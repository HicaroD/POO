package segunda_questao;

public class Gerente extends Usuario {
    Gerente(String nome, int idade) {
        super(nome, idade);
    }

    double salario() {
        return SALARIO_BASE * 15;
    }
}

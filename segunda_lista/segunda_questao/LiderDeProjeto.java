package segunda_questao;

public class LiderDeProjeto extends Usuario {
    LiderDeProjeto(String nome, int idade) {
        super(nome, idade);
    }

    double salario() {
        return SALARIO_BASE * 3;
    }
}

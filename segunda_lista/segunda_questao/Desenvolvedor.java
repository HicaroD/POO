package segunda_questao;

public class Desenvolvedor extends Usuario {
    Desenvolvedor(String nome, int idade) {
        super(nome, idade);
    }

    double salario() {
        return SALARIO_BASE;
    }
}

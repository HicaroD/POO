package segunda_questao;

public abstract class Usuario {
    static double SALARIO_BASE = 1000;

    protected String nome;
    protected int idade;
    protected double salario;

    Usuario(String nome, int idade) {
        if(nome.length() > 50) {
            System.out.println("Nome invalido!");
            System.exit(1);
        }

        this.nome = nome;
        this.idade = idade;
    }

    public void setNome(String nome) {
        if(nome.length() > 50) {
            System.out.println("Nome invalido!");
            System.exit(1);
        }
        this.nome = nome;
    }
}

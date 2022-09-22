package exercicio8;

public class Nota {
    private double valor;
    private String nomeDoAssunto;

    public Nota(double valor, String nomeDoAssunto) {
        this.valor = valor;
        this.nomeDoAssunto = nomeDoAssunto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0 && valor >= 10) {
            System.err.println("Nota inválida");
            System.exit(1);
        }
        this.valor = valor;
    }

    public String getNomeDoAssunto() {
        return nomeDoAssunto;
    }

    public void setNomeDoAssunto(String nomeDoAssunto) {
        this.nomeDoAssunto = nomeDoAssunto;
    }

    @Override
    public String toString() {
        return nomeDoAssunto + ": " + valor + "\n";
    }
}

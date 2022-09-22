package exercicio10;


public class Gmail {
    private Sistema sistema;

    public Gmail(Sistema sistema) {
        this.sistema = sistema;
    }

    void sendEmail(Email email) {
        if(!sistema.funcionarios.contains(email.getOrigem()) || !sistema.funcionarios.contains(email.getDestino())) {
            System.out.println("Origem ou destino não registrado no sistema");
            System.exit(1);
        }
        int origemIndex = sistema.funcionarios.indexOf(email.getOrigem());
        int destinatarioIndex = sistema.funcionarios.indexOf(email.getDestino());

        sistema.funcionarios.get(origemIndex).adicionarNovoEmailEnviado(email);
        sistema.funcionarios.get(destinatarioIndex).adicionarNovoEmailRecebido(email);
    }
}

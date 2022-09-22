package exercicio10;

import java.util.Date;

class Main {
    public static void main(String[] args) { 
        Sistema sistema = new Sistema();
        Gmail gmail = new Gmail(sistema);
        Funcionario funcionario1 = new Funcionario("Hicaro", "Programador", "100101", "hdanrlley1@gmail.com");
        Funcionario funcionario2 = new Funcionario("John", "Motorista", "hello", "john@gmail.com");
        sistema.addFuncionario(funcionario1);
        sistema.addFuncionario(funcionario2);

        Email email = new Email("Algum titulo", "Minha mensagem", funcionario1, funcionario2, new Date());
        gmail.sendEmail(email);

        for(Funcionario funcionario : sistema.funcionarios) {
            System.out.println(funcionario.getName());
            System.out.println(funcionario.getEmail());
            System.out.println("Email recebidos: ");
            for(Email emailRecebido : funcionario.getEmailRecebidos()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
            System.out.println("Email enviados: ");
            for(Email emailRecebido : funcionario.getEmailEnviados()) {
                System.out.println(emailRecebido.getMensagem());
            }
            System.out.println();
        }
    }
}
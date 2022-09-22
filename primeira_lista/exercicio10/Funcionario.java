package exercicio10;

import java.util.ArrayList;

public class Funcionario {
    private String name;
    private String cargo;
    private String matricula;
    private String email;
    private ArrayList<Email> emailRecebidos;
    private ArrayList<Email> emailEnviados;

    public Funcionario(String name, String cargo, String matricula, String email) {
        this.name = name;
        this.cargo = cargo;
        this.matricula = matricula;
        this.email = email;
        this.emailRecebidos = new ArrayList<>();
        this.emailEnviados = new ArrayList<>();
    }

    void adicionarNovoEmailRecebido(Email email) {
        emailRecebidos.add(email);
    }

    void adicionarNovoEmailEnviado(Email email) {
        emailEnviados.add(email);
    }

    public String getName() {
        return name;
    }

    public String getCargo() {
        return cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Email> getEmailRecebidos() {
        return emailRecebidos;
    }

    public ArrayList<Email> getEmailEnviados() {
        return emailEnviados;
    }
}

public class Formulario implements Login {
    String email;
    String senha;

    public Formulario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    @Override
    public void logar() {
        System.out.println("Logando com formulário, a senha é: " + senha);
    }
}

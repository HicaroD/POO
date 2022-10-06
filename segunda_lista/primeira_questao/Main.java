public class Main {
    public static void main(String[] args) {
        Login loginForms = new Formulario("email @gmail.com", "senha123"); 
        loginForms.logar();

        Login loginGoogle = new Google();
        loginGoogle.logar();
    }
}

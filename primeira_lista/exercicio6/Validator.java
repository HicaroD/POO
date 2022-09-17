package exercicio6;

class Validator {
    static public void runValidation(IEntityValidator e) {
        if(e.isValid()) {
            System.out.println("Entidade é valida");
        } else {
            System.out.println("Entidade é invalida");
        }
    }
}
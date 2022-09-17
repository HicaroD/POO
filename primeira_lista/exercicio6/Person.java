package exercicio6;

class Person implements IEntityValidator {
    @Override
    public String toString() {
        return "Type: Person";
    }

    @Override
    public boolean isValid() {
        return false;
    }
}
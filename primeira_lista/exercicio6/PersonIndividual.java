package exercicio6;

class PersonIndividual extends Person {
    private String cpf;

    public PersonIndividual(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return String.format("{Individual}, CPF: %s", cpf);
    }

    @Override
    public boolean isValid() {
        return CpfValidator.isValidCPF(cpf);
    }
}
package exercicio6;

class PersonLegal extends Person {
    private String cnpj;

    public PersonLegal(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return String.format("{Individual}, CNPJ: %s", cnpj);
    }

    @Override
    public boolean isValid() {
        return CnpjValidator.isCNPJ(cnpj); 
    }
}
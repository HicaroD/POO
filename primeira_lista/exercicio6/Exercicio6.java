package exercicio6;

class Exercicio6 {
    public static void main(String[] args) {
        PersonIndividual personIndividual = new PersonIndividual("14332414532");
        PersonLegal personLegal = new PersonLegal("1433241453221");
        System.out.println(personIndividual.isValid());
        System.out.println(personLegal.isValid());
    }
}
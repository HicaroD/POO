package exercicio6;

import java.util.Scanner;

class Exercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o CPF e o CNPJ: ");
        PersonIndividual personIndividual = new PersonIndividual(scanner.nextLine());
        PersonLegal personLegal = new PersonLegal(scanner.nextLine());
        System.out.println(personIndividual.isValid());
        System.out.println(personLegal.isValid());
        scanner.close(); 
    }
}
package exercicio8;

import java.util.ArrayList;

public class Exercicio8 {
    public static void main(String[] args) { 
        ArrayList<Nota> notas = new ArrayList<>();
        notas.add(new Nota(10, "Física"));
        notas.add(new Nota(8, "POO"));
        notas.add(new Nota(7, "Química"));
        notas.add(new Nota(6, "Algébra Linear"));
        notas.add(new Nota(8, "Cálculo 2"));

        Aluno aluno = new Aluno("João Cândido", "20152020", notas);
        System.out.println(aluno);
    }    
}
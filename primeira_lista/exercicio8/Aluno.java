package exercicio8;

import java.util.ArrayList;

public class Aluno {
    public String nomeCompleto;
    public String matricula;
    public ArrayList<Nota> notas;

    public Aluno(String nomeCompleto, String matricula, ArrayList<Nota> notas) {
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.notas = notas;

        if (!IsNameValid()) {
            System.out.println("Nome invalido");
            System.exit(1);
        }
        if (!IsMatriculaValid()) {
            System.out.println("Matrícula invalido");
            System.exit(1);
        }
        if (!IsNotasValid()) {
            System.out.println("Notas invalidas");
            System.exit(1);
        }
    }

    public boolean IsNameValid() {
        return nomeCompleto.split(" ").length >= 2 && nomeCompleto.length() < 50;
    }

    public boolean IsMatriculaValid() {
        return matricula.length() == 8 && matricula.startsWith("201");
    }

    public boolean IsNotasValid() {
        return notas.size() == 5;
    }

    public void descarteNotaMenor() {
        int indiceDaMenorNota = 0;
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).valor < notas.get(1).valor)
                indiceDaMenorNota = i;
        }
        notas.remove(indiceDaMenorNota);
    }

    public double getNotaSemestral() {
        descarteNotaMenor();
        double soma = 0;
        for (Nota nota : notas) {
            soma += nota.valor;
        }
        return soma / 4;
    }

    public double getNotaFinal() {
        double notaSemestral = getNotaSemestral();

        if (notaSemestral < 6) {
            notaSemestral -= (notaSemestral * 0.25);
        } else if (notaSemestral >= 6 && notaSemestral <= 7) {
            notaSemestral = 7;
        } else if (notaSemestral >= 7 && notaSemestral <= 8) {
            notaSemestral += (notaSemestral * 0.15);
        } else {
            notaSemestral = 10;
        }
        return notaSemestral;
    }

    @Override
    public String toString() {
        String notasFormatadas = "";
        for (Nota nota : notas) {
            notasFormatadas += nota + "\n";
        }

        return String.format("Matrícula: %s\nNome completo: %s\nNotas formatadas: %s\nNota semestral: %s\nNota final: %s\n", matricula, nomeCompleto,
                notasFormatadas, getNotaSemestral(), getNotaFinal());
    }
}

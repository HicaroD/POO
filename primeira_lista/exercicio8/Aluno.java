package exercicio8;

import java.text.MessageFormat;
import java.util.ArrayList;

public class Aluno {
    private String nomeCompleto;
    private String matricula;
    private ArrayList<Nota> notas;

    public Aluno(String nomeCompleto, String matricula, ArrayList<Nota> notas) {
        if (!validateNotas(notas)) {
            System.err.println("Número de matrícula invalido");
            System.exit(1);
        }
        if (!validateNomeCompleto(nomeCompleto)) {
            System.err.println("Nome de aluno invalido.");
            System.exit(1);
        }
        if (!validateMatricula(matricula)) {
            System.err.println("Número de matrícula invalido");
            System.exit(1);
        }
        this.nomeCompleto = nomeCompleto;
        this.matricula = matricula;
        this.notas = notas;
    }

    public ArrayList<Nota> getNotas() {
        return notas;
    }

    public boolean validateNotas(ArrayList<Nota> notas) {
        return notas.size() == 5; 
    }

    public boolean validateNomeCompleto(String nomeCompleto) {
        return nomeCompleto.split(" ").length >= 2 && nomeCompleto.length() < 50;
    }

    public boolean validateMatricula(String matricula) {
        return matricula.length() == 8 || matricula.startsWith("201");
    }

    public void setNotas(ArrayList<Nota> notas) {
        if (!validateNotas(notas)) {
            System.err.println("Número de matrícula invalido");
            System.exit(1);
        }
        this.notas = notas;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        if (!validateNomeCompleto(nomeCompleto)) {
            System.err.println("Nome de aluno invalido.");
            System.exit(1);
        }
        this.nomeCompleto = nomeCompleto;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (!validateMatricula(matricula)) {
            System.err.println("Número de matrícula invalido");
            System.exit(1);
        }
        this.matricula = matricula;
    }

    public void descarteNotaMenor() {
        int indiceDaMenorNota = 0;
        for(int i = 0; i < notas.size(); i++) {
            if(notas.get(i).getValor() < notas.get(1).getValor()) indiceDaMenorNota = i;
        }
        notas.remove(indiceDaMenorNota);
    }

    public double getNotaSemestral() {
        descarteNotaMenor();

        double somaDasNotas = 0;
        for(Nota nota : notas) {
            somaDasNotas += nota.getValor();
        }

        return somaDasNotas / 4;
    }

    public double getNotaFinal() {
        double notaFinal = getNotaSemestral();
        if(notaFinal < 6) {
            return notaFinal - (notaFinal * 0.25);
        }
        else if(notaFinal >= 6 && notaFinal < 7) {
            return 7;
        } 
        else if(notaFinal >= 7 && notaFinal <= 8) {
            return notaFinal + (notaFinal * 0.15);
        } 
        else {
            return 10;
        }
    }

    @Override
    public String toString() {
        String notasFormatadas = ""; 
        for(Nota nota : notas) {
            notasFormatadas += nota + "\n";
        }
        return MessageFormat.format("Matrícula: {0}\nNome: {1}\nNotas: {2}\nNota semestral: {3}\nNota final: {4}\n",
                matricula, nomeCompleto, notasFormatadas, getNotaSemestral(), getNotaFinal());
    }
}

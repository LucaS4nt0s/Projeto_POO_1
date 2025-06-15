package ifsuldeminas.academico;	

import ifsuldeminas.funcionarios.Professor;
import ifsuldeminas.alunos.Aluno;

import java.util.ArrayList;

public class Disciplina {

    private String nome;
    private int periodo;
    private int numAulasSemana;
    private int numTotalAulas;
    private int numSemanas;
    private Professor professor;
    private ArrayList<Aluno> alunos;
    private ArrayList<Double> notas;
    private ArrayList<Integer> frequencias;

    public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas) {
        alunos = new ArrayList<Aluno>();
        notas = new ArrayList<Double>();
        frequencias = new ArrayList<Integer>();
        setNome(nome);
        setPeriodo(periodo);
        setNumAulasSemana(numAulasSemana);
        setNumTotalAulas(numSemanas);
        this.professor = null; 
    }
    
    public Disciplina(String nome, int periodo, int numAulasSemana, int numSemanas, Professor professor) { 
        alunos = new ArrayList<>();
        notas = new ArrayList<Double>();
        frequencias = new ArrayList<Integer>();
        setNome(nome);
        setPeriodo(periodo);
        setNumAulasSemana(numAulasSemana);
        setNumTotalAulas(numSemanas);
        setProfessor(professor);
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty()) {
            this.nome = nome;
        } else if(nome.length() < 3){
            System.out.println("Nome muito curto!");
        } else {
            System.out.println("Nome invalido!");
        }
    }
    
    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        if (periodo >= 1 && periodo <= 10){
            this.periodo = periodo;
        } else {
            System.out.println("Periodo invalido!");
        }
    }

    public int getNumAulasSemana() {
        return numAulasSemana;
    }

    public void setNumAulasSemana(int numAulasSemana) {
        if (numAulasSemana >= 1 && numAulasSemana <= 4) {
            this.numAulasSemana = numAulasSemana;
        } else {
            System.out.println("Numero de aulas por semana invalido!");
        }
    }
    
    public int getNumTotalAulas() {
        return numTotalAulas;
    }

    public void setNumTotalAulas(int numSemanas) {
        if (numSemanas >= 1 && numSemanas <= 30) {
            numTotalAulas = numAulasSemana * numSemanas;
        } else {
            System.out.println("Numero de semanas invalido!");
        }
    }
   
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        if (professor != null) {
            this.professor = professor;
        } else {
            System.out.println("Professor invalido!");
        }
    }

    public void removerProfessor() {
        this.professor = null;   
    }
    
    public int getNumAlunos() {
        return alunos.size();
    }
    
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public ArrayList<Integer> getFrequencias() {
        return frequencias;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", periodo=" + periodo +
                ", numAulasSemana=" + numAulasSemana +
                ", numTotalAulas=" + numTotalAulas +
                ", professor=" + (professor != null ? professor.getNome() : "Nenhum") +
                '}';
    }


    public boolean matricularAluno(Aluno aluno) {
        if (aluno != null && !alunos.contains(aluno.getRa())) {
            alunos.add(aluno);
            notas.add(0.0);
            frequencias.add(0); 
            return true;
        } else {
            return false;  
        }
    }

    public boolean desmatricularAluno(int posAluno){
        if (posAluno >= 0 && posAluno < alunos.size()) {
            alunos.remove(posAluno);
            notas.remove(posAluno);
            frequencias.remove(posAluno);
            return true;
        }else{
            System.out.println("Posicao invalida!");
            return false;   
        } 
    }

    public boolean addNota(int posAluno, double nota){
        if (posAluno >= 0 && posAluno < alunos.size() && nota >= 0 && nota <= 10) {
            if(notas.get(posAluno) + nota > 10) {
                System.out.println("Nota invalida! A nota nao pode ser maior que 10.");
                return false;
            }
            notas.set(posAluno, notas.get(posAluno) + nota);
            return true;
        } else {
            System.out.println("Posicao ou nota invalida!");
            return false;
        }
    }
    

    public boolean addFrequencia(int posAluno, int frequenciaTotal) {
        if (posAluno >= 0 && posAluno < alunos.size() && frequenciaTotal >= 0 && frequenciaTotal <= numTotalAulas) {  
            frequencias.set(posAluno, frequencias.get(posAluno) + frequenciaTotal);
            return true;
        } else {
            System.out.println("Posicao ou frequencia invalida!");
            return false;
        }
    }

    public boolean estaAprovado(int posAluno) {
        if (posAluno >= 0 && posAluno < alunos.size() && notas.get(posAluno) >= 6 && frequencias.get(posAluno) >= (0.75 * numTotalAulas)) {
            System.out.println("Aluno " + alunos.get(posAluno).getNome() + " aprovado!");
            return true;
        } else if (posAluno >= 0 && posAluno < alunos.size()) {
            System.out.println("Aluno " + alunos.get(posAluno).getNome() + " reprovado!");
            return false;
        } else {
            System.out.println("Posicao invalida!");
            return false;
        }
    }

    public void exibirReprovados (){
        System.out.println("Alunos reprovados na disciplina:");
        for (int i = 0; i < alunos.size(); i++) {
            if (!estaAprovado(i)) {
                System.out.println("=================================");
            }
        }
        
    }

    public void exibirAprovados(){
        System.out.println("Alunos aprovados na disciplina:");
        for (int i = 0; i < alunos.size(); i++) {
            if (estaAprovado(i)) {
                System.out.println("=================================");
            }
        }   
    }

    public double calcularMedia(){
        double media = 0.0;
        for (double nota : notas) {
            media += nota;
        }

        media /= notas.size();
        return media;
    }
    
    public void exibirMaiorNota(){
        double maiorNota = 0.0;
        int posAluno = -1;

        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i) > maiorNota) {
                maiorNota = notas.get(i);
                posAluno = i;
            }
        }

        if (posAluno != -1) {
            System.out.println("Aluno com a maior nota: " + alunos.get(posAluno).getNome() + " com nota: " + maiorNota);
        } else {
            System.out.println("Nenhum aluno matriculado.");
        }
    }

    public void exibirMenorNota(){
        double menorNota = 10.0;
        int posAluno = 0;
        if (notas.size() > 0) {
            menorNota = notas.get(0);
            posAluno = 0;

            for (int i = 1; i < notas.size(); i++) {
                if (notas.get(i) < menorNota) {
                    menorNota = notas.get(i);
                    posAluno = i;
                }
            }

            System.out.println("Aluno com a menor nota: " + alunos.get(posAluno).getNome() + " com nota: " + menorNota);
        } else {
            System.out.println("Nenhum aluno matriculado.");
        }
    }

    public int getQuantidadeReprovados() {
        int count = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (!estaAprovado(i)) {
                count++;
            }
        }
        return count;
    }

    public int getQuantidadeAprovados() {
        int count = 0;
        for (int i = 0; i < alunos.size(); i++) {
            if (estaAprovado(i)) {
                count++;
            }
        }
        return count;
    }

    public void exibirProfessor() {
        if (professor != null) {
            System.out.println("Professor da disciplina: " + professor.getNome());
            System.out.println("SUAP: " + professor.getSuap());
        } else {
            System.out.println("Disciplina não possui professor.");
        }
    }

    public double getAproveitamentoAluno(int posAluno){
        if (posAluno >= 0 && posAluno < alunos.size()) {
            int frequencia = frequencias.get(posAluno);
            double aproveitamento = (frequencia / (double) numTotalAulas) * 100;
            return aproveitamento;
        } else {
            System.out.println("Posicao invalida!");
            return -1;
        }
    }

    public double getNotaAluno(int posAluno) {
        if (posAluno >= 0 && posAluno < alunos.size()) {
            return notas.get(posAluno);
        } else {
            System.out.println("Posicao invalida!");
            return -1;
        }
    }

    public void exibirAlunosAcimaMedia(){
        if(alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }else{
            double media = calcularMedia();
            System.out.println("Alunos com nota acima da média (" + media + "):");
            for (int i = 0; i < alunos.size(); i++) {
                if (notas.get(i) > media) {
                    System.out.println(alunos.get(i).getNome() + " - Nota: " + notas.get(i));
                }
            }
            System.out.println("=================================");
        }
    }

    public void exibirAlunosAbaixoMedia(){
        if(alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }else{
            double media = calcularMedia();
            System.out.println("Alunos com nota abaixo da média (" + media + "):");
            for (int i = 0; i < alunos.size(); i++) {
                if (notas.get(i) < media) {
                    System.out.println(alunos.get(i).getNome() + " - Nota: " + notas.get(i));
                }
            }
            System.out.println("=================================");
        }
    }

    public void exibirAlunoNotaAproveitamento(){
        if(alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }else{
            System.out.println("Alunos, notas e aproveitamento:");
            for (int i = 0; i < alunos.size(); i++) {
                double aproveitamento = getAproveitamentoAluno(i);
                double nota = getNotaAluno(i);
                System.out.println("Aluno: " + alunos.get(i).getNome() + ", Nota: " + nota + ", Aproveitamento: " + aproveitamento + "%");
            }
            System.out.println("=================================");
        }
    }

    public void desmatricularAluno(){
        if (alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }
        for (Aluno aluno : alunos) {
            System.out.println("Desmatriculando aluno: " + aluno.getNome());
            int posAluno = alunos.indexOf(aluno);
            notas.remove(posAluno);
            frequencias.remove(posAluno);
            aluno.remove(this);
            System.out.println("Aluno " + aluno.getNome() + " desmatriculado com sucesso.");
            System.out.println("=================================");
        }
    }

    public void exibirOrdenadosPorNota(){
        if (alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }

        ArrayList<Aluno> alunosOrdenados = new ArrayList<>(alunos);
        ArrayList<Double> notasOrdenadas = new ArrayList<>(notas);

        // Ordena as notas e os alunos correspondentes por nota (maior para menor)
        for (int i = 0; i < notasOrdenadas.size() - 1; i++) {
            for (int j = i + 1; j < notasOrdenadas.size(); j++) {
                if (notasOrdenadas.get(i) > notasOrdenadas.get(j)) {
                    // Troca as notas
                    double tempNota = notasOrdenadas.get(i);
                    notasOrdenadas.set(i, notasOrdenadas.get(j));
                    notasOrdenadas.set(j, tempNota);

                    // Troca os alunos correspondentes
                    Aluno tempAluno = alunosOrdenados.get(i);
                    alunosOrdenados.set(i, alunosOrdenados.get(j));
                    alunosOrdenados.set(j, tempAluno);
                }
            }
        }

        System.out.println("Alunos ordenados por nota (maior para menor):");
        for (int i = 0; i < alunosOrdenados.size(); i++) {
            System.out.println(alunosOrdenados.get(i).getNome() + " - Nota: " + notasOrdenadas.get(i));
        }
        System.out.println("=================================");
    }

    public void exibirDisciplina() {
        if (alunos.size() == 0) {
            System.out.println("Nenhum aluno matriculado.");
            return;
        }
        System.out.println("Nome: " + getNome());
        System.out.println("Periodo: " + getPeriodo());
        System.out.println("Numero de aulas por semana: " + getNumAulasSemana());
        System.out.println("Numero total de aulas: " + getNumTotalAulas());
        exibirProfessor();
        System.out.println("Numero de alunos matriculados: " + getNumAlunos());
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println(" - " + aluno.getNome() + " (RA: " + aluno.getRa() + ")");
            posAluno = alunos.indexOf(aluno);
            System.out.println("   Nota: " + notas.get(posAluno));
            System.out.println("   Frequencia: " + frequencias.get(posAluno) + "/" + numTotalAulas);
        }
        System.out.println("=================================");
        System.out.println("Media da disciplina: " + calcularMedia());
        System.out.println("Quantidade de alunos" + getNumAlunos());
        System.out.println("Quantidade de alunos aprovados: " + getQuantidadeAprovados());
        System.out.println("Quantidade de alunos reprovados: " + getQuantidadeReprovados());
    }

}
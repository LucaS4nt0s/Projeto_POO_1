package ifsuldeminas.alunos;

public class Aluno {
    private String nome;
    private int ra;
    private int periodo;
    private String curso;

    public Aluno(String nome, int ra, int periodo, String curso) {
        setNome(nome);
        setRa(ra);
        setPeriodo(periodo);
        setCurso(curso);
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

    public int getRa() {
        return ra;
    }
    
    public void setRa(int ra) {
        if(ra >= 1000 && ra <= 9999) {
            this.ra = ra;
        } else {
            System.out.println("Ra invalida!");
        }
    }

    public int getPeriodo() {
        return periodo;
    }
    public void setPeriodo(int periodo) {
        if (periodo >= 1 && periodo <= 10){
            this.periodo = periodo;
        }
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        if(curso != null && !curso.isEmpty()) {
            this.curso = curso;
        } else {
            System.out.println("Curso invalido!");
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", ra=" + ra +
                ", periodo=" + periodo +
                ", curso='" + curso + '\'' +
                '}';
    }

    public void exibirAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("RA: " + ra);
        System.out.println("Periodo: " + periodo);
        System.out.println("Curso: " + curso);
    }

}

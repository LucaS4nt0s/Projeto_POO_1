package ifsuldeminas.alunos;

public class Aluno {
    private String nome;
    private int ra;
    private int periodo;
    private String curso;

    public Aluno(String nome, int ra, int periodo, String curso) {

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
        if (periodo >= 1 && periodo <= 25){
            this.periodo = periodo;
        }
    }
}

package ifsuldeminas.funcionarios;

public class Professor {
    private String nome;
    private int suap;

    public Professor(String nome, int suap) {
        setNome(nome);
        setSuap(suap);
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

    public int getSuap() {
        return suap;
    }
    public void setSuap(int suap) {
        if(suap >= 1000 && suap <= 9999) {
            this.suap = suap;
        } else {
            System.out.println("SUAP invalido!");
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", suap=" + suap +
                '}';
    }

    public void exibirProfessor() {
        System.out.println("Nome: " + getNome());
        System.out.println("SUAP: " + getSuap());
    }
}
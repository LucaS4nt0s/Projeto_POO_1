package ifsuldeminas.main;
import java.util.Scanner;
import ifsuldeminas.alunos.Aluno;
import ifsuldeminas.academico.Disciplina;
import ifsuldeminas.funcionarios.Professor;

public class Main{
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("Programação Orientada a Objetos", 1, 4, 15);

        Aluno aluno1 = new Aluno("João Silva", 1001, 1, "Engenharia da Computação");
        Aluno aluno2 = new Aluno("Maria Oliveira", 1002, 1, "Engenharia da Computação");
        Aluno aluno3 = new Aluno("Pedro Santos", 1003, 1, "Engenharia da Computação");
        Aluno aluno4 = new Aluno("Ana Costa", 1004, 1, "Engenharia da Computação");
        Aluno aluno5 = new Aluno("Lucas Pereira", 1005, 1, "Engenharia da Computação");
        Aluno aluno6 = new Aluno("Fernanda Lima", 1006, 1, "Engenharia da Computação");
        Aluno aluno7 = new Aluno("Carla Souza", 1007, 1, "Engenharia da Computação");
        Aluno aluno8 = new Aluno("Rafael Almeida", 1008, 1, "Engenharia da Computação");
        Aluno aluno9 = new Aluno("Juliana Rocha", 1009, 1, "Engenharia da Computação");
        Aluno aluno10 = new Aluno("Gabriel Martins", 1010, 1, "Engenharia da Computação");

        disciplina.matricularAluno(aluno1);
        disciplina.matricularAluno(aluno2);
        disciplina.matricularAluno(aluno3);
        disciplina.matricularAluno(aluno4);
        disciplina.matricularAluno(aluno5);
        disciplina.matricularAluno(aluno6);
        disciplina.matricularAluno(aluno7);
        disciplina.matricularAluno(aluno8);
        disciplina.matricularAluno(aluno9);
        disciplina.matricularAluno(aluno10);

        disciplina.addNota(0, 8.5);
        disciplina.addNota(1, 7.0);
        disciplina.addNota(2, 4.0);
        disciplina.addNota(3, 6.5);
        disciplina.addNota(4, 10.0);
        disciplina.addNota(5, 5.0);
        disciplina.addNota(6, 8.0);
        disciplina.addNota(7, 5.5);
        disciplina.addNota(8, 6.0);
        disciplina.addNota(9, 9.5);

        disciplina.addFrequencia(0, 60);
        disciplina.addFrequencia(1, 56);
        disciplina.addFrequencia(2, 40);
        disciplina.addFrequencia(3, 50);
        disciplina.addFrequencia(4, 30);
        disciplina.addFrequencia(5, 22);
        disciplina.addFrequencia(6, 38);
        disciplina.addFrequencia(7, 60);
        disciplina.addFrequencia(8, 58);
        disciplina.addFrequencia(9, 28);

        Professor professor = new Professor("Carlos Alberto", 1234);
        disciplina.setProfessor(professor);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do{
            System.out.println("Menu:");
            System.out.println("Digite o número da opção desejada:");
            System.out.println("0 - Sair (encerrar o programa)");
            System.out.println("1 - Imprimir informações da disciplina");
            System.out.println("2 - Apresentar número de alunos na disciplina, número de reprovados e número de aprovados;");
            System.out.println("3 - Imprimir aprovados");
            System.out.println("4 - Imprimir reprovados");
            System.out.println("5 - Imprimir aluno com a maior e o aluno com menor nota");
            System.out.println("6 - Imprimir o professor responsável");
            System.out.println("7 - Imprimir média total da turma e listar todos os alunos acima da média");
            System.out.println("8 - Imprimir média total da turma e listar todos os alunos abaixo da média");
            System.out.println("9 - Imprimir nome dos alunos e suas respectivas notas e aproveitamento");
            System.out.println("10 - Imprimir alunos ordenados por nota");
            System.out.println("11 - Matricular aluno");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    disciplina.desmatricularAluno();
                    disciplina.removerProfessor();
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("Informações da Disciplina:");
                    disciplina.exibirDisciplina();
                    break;
                case 2:
                    System.out.println("Número de Alunos: " + disciplina.getNumAlunos());
                    System.out.println("Número de Reprovados: " + disciplina.getNumReprovados());
                    System.out.println("Número de Aprovados: " + disciplina.getNumAprovados());
                    break;
                case 3:
                    System.out.println("Aprovados:");
                    disciplina.exibirAprovados();
                    break;
                case 4:
                    System.out.println("Reprovados:");
                    disciplina.exibirReprovados();
                    break;
                case 5:
                    System.out.println("Aluno com a Maior Nota:");
                    disciplina.exibirMaiorNota();
                    System.out.println("==========================");
                    System.out.println("Aluno com a Menor Nota:");
                    disciplina.exibirMenorNota();
                    break;
                case 6:
                    System.out.println("Professor Responsável:");
                    disciplina.exibirProfessor();
                    break;
                case 7:
                    System.out.println("Média Total da Turma: " + disciplina.calcularMedia());
                    System.out.println("Alunos Acima da Média:");
                    disciplina.exibirAlunosAcimaMedia();
                    break;
                case 8:
                    System.out.println("Média Total da Turma: " + disciplina.calcularMedia());
                    System.out.println("Alunos Abaixo da Média:");
                    disciplina.exibirAlunosAbaixoMedia();
                    break;
                case 9:
                    System.out.println("Nome dos Alunos e suas Respectivas Notas e Aproveitamento:");
                    disciplina.exibirAlunoNotaAproveitamento();
                    break;
                case 10:
                    System.out.println("Alunos Ordenados por Nota:");
                    disciplina.exibirOrdenadosPorNota();
                    break;
                case 11:
                    do{
                        System.out.println("Matricular Aluno:");
                        System.out.print("Digite o nome do aluno: ");
                        scanner.nextLine(); 
                        String nome = scanner.nextLine();
                        System.out.print("Digite o curso do aluno: ");
                        String curso = scanner.nextLine();
                        System.out.print("Digite o RA do aluno: ");
                        int ra = scanner.nextInt();
                        Aluno novoAluno = new Aluno(nome, ra, 1, curso);
                    }while(!novoAluno.isValid());

                    boolean matriculaValida = disciplina.matricularAluno(novoAluno);
                    if(matriculaValida) {
                        System.out.println("Aluno " + novoAluno.getNome() + " matriculado com sucesso!");
                    } else {
                        System.out.println("Não foi possível matricular o aluno. RA semelhante já cadastrado");
                        return;
                    }
                    
                    do{
                        boolean notaValida = false;
                        System.out.println("Digite a nota do aluno: ");
                        double nota = scanner.nextDouble();
                        notaValida = disciplina.addNota(disciplina.getNumAlunos() - 1, nota);
                    }while(!notaValida);

                    do{
                        boolean frequenciaValida = false;
                        System.out.println("Digite a frequência do aluno: ");
                        int frequencia = scanner.nextInt();
                        frequenciaValida = disciplina.addFrequencia(disciplina.getNumAlunos() - 1, frequencia);
                    }while(!frequenciaValida);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
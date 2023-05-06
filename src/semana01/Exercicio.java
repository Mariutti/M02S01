package semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>(); //ArrayList com os alunos do loop while
        ArrayList<double[]> boletim = new ArrayList<>();
        ArrayList<ArrayList<String>> aprovados = new ArrayList<>();
        ArrayList<ArrayList<String>> rerovados = new ArrayList<>();
        boolean continuar = true;

        //loop while para perguntar o nome do aluno e as notas, enquanto não for escrito "fim"
        while (continuar){
            System.out.println("Digite o nome do aluno ou FIM para sair do programa: ");
            Scanner entrada = new Scanner(System.in);
            String aluno = entrada.nextLine();
            if(aluno.equalsIgnoreCase("fim")){
                continuar = false;
            }else {
                alunos.add(aluno);
                double[] notas = new double[3];
                //loop for com 3 iterações para preencher o Array com 3 notas
                for(int i = 0; i < 3; i++) {
                    System.out.println("Digite a " + (i+1) + "ª nota: ");
                    notas[i] = entrada.nextDouble();
                }
                //notas são adicionadas ao Array de 3 posições - boletim
                boletim.add(notas);
            }

        }
        //loop do tipo forEach para cada aluno da lista criada no loop wile
        for (String aluno: alunos) {
            int index = alunos.indexOf(aluno);
            ArrayList<String> resultadoAluno = new ArrayList<>(); //ArrayList criado para guardar as informações do
            // aluno (nome e notas)
            double somaNotas = 0;
            // loop do tipo forEach, para iterar em cada nota do boletim, par o somatório das notas de um aluno
            for (double nota: boletim.get(index)
                 ) {
                somaNotas += nota;
            }
            double media = somaNotas/(boletim.get(index).length);
            System.out.printf("Aluno(a) %s.\n", aluno);
            System.out.printf("Notas: %s.\n", Arrays.toString(boletim.get(index)));
            System.out.printf("A média do(a) aluno(a) %s, com as notas %s, foi de %.2f \n", aluno,
                    Arrays.toString(boletim.get(index)), media);
            resultadoAluno.add(aluno);
            resultadoAluno.add(Arrays.toString(boletim.get(index)));
            resultadoAluno.add(String.format("%.2f", media));

            if(media >= 7){
                aprovados.add(resultadoAluno);
            }else{
                rerovados.add(resultadoAluno);
            }

        }
        System.out.println("-----------------------------");
        System.out.println("Lista de alunos aprovados:");
        for ( ArrayList<String> aprovado : aprovados){
            System.out.printf("Aluno(a) %s com notas %s e media %s \n",aprovado.get(0).toString(),
                    aprovado.get(1).toString(), aprovado.get(2).toString());
        }System.out.println("Lista de alunos reprovados:");
        for ( ArrayList<String> reprovado : rerovados){
            System.out.printf("Aluno(a) %s com notas %s e media %s \n",reprovado.get(0).toString(),
                    reprovado.get(1).toString(), reprovado.get(2).toString());
        }
    }
}

//   TODO 10 - Por fim faça uma nova alteração mostrando a lista dos aprovados e reprovados, mostrando nome e média, para tanto a média deve ser maior ou igual a 7.0
package semana01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        ArrayList<double[]> boletim = new ArrayList<>();
        boolean continuar = true;

        while (continuar){
            System.out.println("Digite o nome do aluno ou FIM para sair do programa: ");
            Scanner entrada = new Scanner(System.in);
            String aluno = entrada.nextLine();
            if(aluno.equalsIgnoreCase("fim")){
                continuar = false;
            }else {
                alunos.add(aluno);
                double[] notas = new double[3];
                for(int i = 0; i < 3; i++) {
                    System.out.println("Digite a " + (i+1) + "ª nota: ");
                    notas[i] = entrada.nextDouble();
                }
                boletim.add(notas);
            }

        }
        for (String aluno: alunos) {
            int index = alunos.indexOf(aluno);
            System.out.printf("Aluno(a) %s.\n", aluno);
            System.out.printf("Notas: %s.\n", Arrays.toString(boletim.get(index)));

        }
    }
}

//    TODO 8 - Quando então digitado FIM, deverá exibir então a lista de alunos e suas notas

//    TODO 9 - Faça uma alteração para calcular a média e exibir junto com a lista de alunos e suas notas

//    TODO 10 - Por fim faça uma nova alteração mostrando a lista dos aprovados e reprovados, mostrando nome e média, para tanto a média deve ser maior ou igual a 7.0
package semana01;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        double[] notas = new double[3];
        boolean continuar = true;

        while (continuar){
            System.out.println("Digite o nome do aluno ou FIM para sair do programa: ");
            Scanner entrada = new Scanner(System.in);
            String aluno = entrada.nextLine();
            if(aluno.equalsIgnoreCase("fim")){
                continuar = false;
            }else {
                alunos.add(aluno);
            }
            for(int i = 0; i < 3; i++) {
                System.out.println("Digite a " + i + " nota: ");
                notas[i] = entrada.nextInt();
            }
        }
        System.out.println(alunos.toString());
        System.out.println("Fim da aplicação.");
    }
}


//    TODO 6 - Ainda dentro do laço de repetição while receba agora 3 notas e armazene em Array ( Vetor ) de 3 posições

//    TODO 7 - Faça uma alteração para armazenar agora esse vetor em um ArrayList

//    TODO 8 - Quando então digitado FIM, deverá exibir então a lista de alunos e suas notas

//    TODO 9 - Faça uma alteração para calcular a média e exibir junto com a lista de alunos e suas notas

//    TODO 10 - Por fim faça uma nova alteração mostrando a lista dos aprovados e reprovados, mostrando nome e média, para tanto a média deve ser maior ou igual a 7.0
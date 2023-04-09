/*Altere o programa do exercício anterior para ficar recebendo o número dentro
de um laço enquanto for diferente de 0 (zero)*/

import java.util.Scanner;

public class BMExercicio06 {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe um numero de 1 a 7 (digite 0 para encerrar):");
		int diaSemana = scan.nextInt();
        while(diaSemana != 0){
            switch(diaSemana){
                case 1: 
                    System.out.println("O dia da semana eh Domingo");
                    break;
                case 2:
                    System.out.println("O dia da semana eh Segunda-feira");
                    break;
                case 3:
                    System.out.println("O dia da semana eh Terca-feira");
                    break;
                case 4:
                    System.out.println("O dia da semana eh Quarta-feira");
                    break;
                case 5:
                    System.out.println("O dia da semana eh Quinta-feira");
                    break;
                case 6:
                    System.out.println("O dia da semana eh Sexta-feira");
                    break;
                case 7:
                    System.out.println("O dia da semana eh Sabado");
                    break;
            }
            System.out.println();
            System.out.println("Informe um numero de 1 a 7:");
		    diaSemana = scan.nextInt();
        }
        if (diaSemana == 0) {
            System.out.println("Programa Encerrado");
        }
	}
}

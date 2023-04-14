/*
 * Escreva um programa que, dada uma variável x (com valor 180, por
 *   exemplo), temos y de acordo com a seguinte regra:
 *   
 *   se x é par, y = x / 2
 *   se x é impar, y = 3 * x + 1
 *   imprime y
 *   O programa deve então jogar o valor de y em x e continuar até que y
 *   tenha o valor final de 1.
 *   Por exemplo, para x = 13, a saída será:
 *   40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
 */
import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in); //Ler o numeros
        int x = 0; //Iniciando a variavel com valor 0 
        int y = 0;

        System.out.println("Informe um numero: ");
        x = ler.nextInt(); //Recendo o valor 

        while(y != 1){ //Laço While, ira rodar enquanto o valor y for diferente de 1 
            if(x % 2 == 0){ //Caso for par
                y = x/2;
            }
            else{ //caso for impar
                y = 3*x+1;
            }
            x = y; //Modificando o valor da variavel x
            if(y != 1){ //Caso for diferente para imprimir o resultado
                System.out.print(y + "->"); 
            }
            else{ //Caso não seja
                System.out.print(y);
            }
        }
    }
}

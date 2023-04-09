//Reescreva o programa anterior utilizando o comando do-while.

public class BMExercicio10 {
    public static void main(String[] args) {
        int cont = 1; //Variavel contador, conta o numeros de vezes que while fez um ciclo
        int x = 10; //Variavel x

        do{ //Laço Do While ira repetir enquanto o contado for menor que 20
            System.out.println("Valor de x: " + x); //Imprimindo o valor de x
            System.out.println("Contador: " + cont); //Imprimindo o valor do cont
            System.out.println();
            cont++;    
        }while(cont <= 20);
    }
}

//Escreva um programa que implemente um laço while que execute 20 
//vezes, imprimindo o valor da variável x que inicialmente está com valor 10.

public class BMExercicio09 {
    public static void main(String[] args) {
        int cont = 1; //Variavel contador, conta o numeros de vezes que while fez um ciclo
        int x = 10; //Variavel x

        while(cont <= 20){ //Laço While ira repetir enquanto o contado for menor que 20
            System.out.println("Valor de x: " + x); //Imprimindo o valor de x
            System.out.println("Contador: " + cont); //Imprimindo o valor do cont
            System.out.println();
            cont++;    
        }
    }
}

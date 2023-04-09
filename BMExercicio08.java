//Escreva um programa que imprima todos os múltiplos de 3, entre 1 e 100.

public class BMExercicio08 {
    public static void main(String[] args) {
        int k;

        System.out.println("Imprimmindo os multiplos de 3, entre 1 e 100");
        for(k=1; k<=100; k++){ //Uso do for
            if (k % 3 == 0) { //Caso a k seja divisivel por 3
                System.out.println(k);
            }
        }
    }
}

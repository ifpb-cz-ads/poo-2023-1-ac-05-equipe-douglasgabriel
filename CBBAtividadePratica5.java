//Faça um programa que imprima os números pares de 0 a 100.

public class CBBAtividadePratica5 {
    public static void main(String[] args) {
        int k;

        for(k=0; k<=100; k++){ //Uso do FOR para contar todos os numeros de 0 a 100
            if(k % 2 == 0){ //Uso do IF para dividir o numero por 2, caso o resto da divisão for 0, o numero é par. 
                System.out.println(k);
            }
        }
    }
}

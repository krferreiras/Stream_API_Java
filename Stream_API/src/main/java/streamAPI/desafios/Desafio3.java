package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;
    /*
    *   Desafio 3 - Verifique se todos os números da lista são positivos:
    *   Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
    */
public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(-5,-6,-2,-1,1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean verificarPositivos = numeros.stream().allMatch(numero -> numero >= 0);

        if (verificarPositivos) {
            System.out.println("Todos os valores são positivos:" + numeros);
        }else {
            System.out.print("A lista possui números negativos: ");
            numeros.stream().filter(numero -> numero < 0).forEach(System.out::print);
        }
    }
}

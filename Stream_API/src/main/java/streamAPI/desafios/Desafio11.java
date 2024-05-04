package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;
    /*
    Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
     */
public class Desafio11 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> quadradoDosElementos = numeros.stream().map(numero -> (int) Math.pow(numero,2)).toList();
        System.out.println(quadradoDosElementos);
        System.out.println(quadradoDosElementos.stream().reduce(0, Integer::sum));

    }
}

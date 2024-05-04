package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/*
    *   Desafio 14 - Encontre o maior número primo da lista:
    *   Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
     */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> numerosPares = (Set) numeros.stream().filter(n -> n > 1 && IntStream.rangeClosed(2, (int) Math.sqrt(n))
                .noneMatch(divisor -> n % divisor == 0)).toList();

        System.out.println(numerosPares);
    }
}

package streamAPI.desafios;

import java.util.Arrays;
import java.util.List;
    /*
    Desafio 6 - Verificar se a lista contém algum número maior que 10:
Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
     */
public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3,12);

        boolean verificaNMaiorQue10 = numeros.stream().anyMatch(n -> n > 10);

        if (verificaNMaiorQue10){
            System.out.print("Existe(m) número(s) maior(es) que 10: ");
            numeros.stream().filter(n -> n > 10).forEach(System.out::print);
        }else {
            System.out.println("Não existe número maior que 10 na lista!");
        }
    }
}

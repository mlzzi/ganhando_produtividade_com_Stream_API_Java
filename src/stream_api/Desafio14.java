package stream_api;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.

public class Desafio14 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().filter(Desafio14::ehPrimo).distinct().min(Comparator.reverseOrder()).orElse(null));

    }

    public static boolean ehPrimo(int numero) {
        if (numero > 2) {
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0)
                    return false;
            }
            return true;
        }
        return false;
    }
}

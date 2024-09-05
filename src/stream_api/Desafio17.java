package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
//
public class Desafio17 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        System.out.println(numeros.stream().filter(Desafio17::ehPrimo).toList());

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

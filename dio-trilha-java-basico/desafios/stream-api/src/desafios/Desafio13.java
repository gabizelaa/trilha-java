package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio13 {
    public static void main(String[] args) {
        int min = 5;
        int max = 10;

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> dentroIntervalo = numeros.stream()
                .filter(n -> min <= n && n <= max)
                .toList();

        System.out.println("Números dentro do intervalo [" + min + ", " + max + "]: " + dentroIntervalo);
    }
}

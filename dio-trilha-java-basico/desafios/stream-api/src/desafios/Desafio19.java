package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio19 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> divisivelPor3e5 = numero -> numero % 3 == 0 && numero % 5 == 0;

        int soma = numeros.stream()
                .filter(divisivelPor3e5)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Soma dos números divisíveis por 3 e 5: " + soma);

    }
}

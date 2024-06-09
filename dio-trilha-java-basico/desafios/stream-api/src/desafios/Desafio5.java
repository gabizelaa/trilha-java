package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> maioresQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .collect(Collectors.toList());

        if (maioresQueCinco.isEmpty()) {
            System.out.println("Não há números maiores que 5 na lista");
        } else {
            double media = maioresQueCinco.stream()
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .getAsDouble();
            System.out.println("Média dos números maiores que 5: " + media);
        }
    }
}

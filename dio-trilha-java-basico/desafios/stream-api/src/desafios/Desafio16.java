package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> agrupamento = numeros.stream()
                .collect(Collectors.groupingBy(numero -> numero % 2 == 0));

        List<Integer> pares = agrupamento.get(true);
        System.out.println("Pares: " + pares);

        List<Integer> impares = agrupamento.get(false);
        System.out.println("Ímpares: " + impares);
    }
}

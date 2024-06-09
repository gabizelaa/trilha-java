package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Desafio10 {
    public static <Consumer> void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> agrupados = numeros.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.groupingBy(n -> n % 3 == 0 || n % 5 == 0))
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("False: ímpares não múltiplos");
        System.out.println("True: ímpares múltiplos");
        agrupados.forEach((chave, valores) -> System.out.println(chave + ": " + valores));
    }
    }



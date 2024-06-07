package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio9 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean saoDistintos = numeros.stream()
                .collect(Collectors.toSet())
                .size() == numeros.size();

        if (saoDistintos == true){
            System.out.println("Todos são números distintos");
        } else {
            System.out.println("Não são distintos");
        }
    }
}

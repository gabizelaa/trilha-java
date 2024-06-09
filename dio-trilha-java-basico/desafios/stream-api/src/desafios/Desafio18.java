package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosIguais = numeros.stream()
                .distinct()
                .toList()
                .size() == 1;

        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}

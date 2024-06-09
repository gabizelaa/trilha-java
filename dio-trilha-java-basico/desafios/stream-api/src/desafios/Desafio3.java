package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> isPositive = numero -> {
            if (numero >= 0){
                return true;
            } else {
                return false;
            }
        };

        boolean todosPositivos = numeros.stream()
                        .allMatch(isPositive);

        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
}

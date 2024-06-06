package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Desafio3 {
    public static boolean todosPositivos(List<Integer> numeros) {
        Predicate<Integer> isPositive = numero -> numero > 0;
        return numeros.stream().allMatch(isPositive);
    }

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);

        boolean todosPositivos = todosPositivos(lista);

        System.out.println("Todos os números são positivos: " + todosPositivos);
    }
}

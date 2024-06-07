package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtra apenas os números maiores que 5 e converte para DoubleStream
        DoubleStream acimaDeCinco = numeros.stream()
                .filter(n -> n > 5)
                .mapToDouble(n -> (double) n);

        OptionalDouble media = acimaDeCinco.average();
            System.out.println(media);
    }
}

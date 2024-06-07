package desafios;

import java.util.Arrays;
import java.util.List;

public class Desafio6 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean existeMaiorQueDez = numeros.stream()
                        .anyMatch(n -> n > 10);

        if (existeMaiorQueDez){
            System.out.println("Sim, existe algum número maior que 10");
        } else {
            System.out.println("Não existe algum número maior que 10");
        }
    }


}

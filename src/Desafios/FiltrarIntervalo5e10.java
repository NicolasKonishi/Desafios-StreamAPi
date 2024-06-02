package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FiltrarIntervalo5e10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> filtrar = numeros.stream().filter(n -> n>5 && n<10).toList();
        System.out.println(filtrar);

    }
}

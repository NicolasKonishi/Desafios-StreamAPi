package Desafios;

import java.util.Arrays;
import java.util.List;

public class SomaNumeros3e5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaDivisivelPor3e5 = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(somaDivisivelPor3e5);

    }
}

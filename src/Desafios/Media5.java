package Desafios;

import java.util.Arrays;
import java.util.List;

public class Media5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        double maioresQue5 = numeros.stream().filter(n -> n>5).mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(maioresQue5);
    }
}

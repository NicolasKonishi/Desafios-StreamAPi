package Desafios;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultiplosDe3ou5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multiplos3or5 = numeros.stream().filter(n->n%2!=0 &&(n % 3== 0 || n % 5==0)).toList();
        System.out.println(multiplos3or5);
    }
}

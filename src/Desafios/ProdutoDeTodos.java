package Desafios;

import java.util.Arrays;
import java.util.List;

public class ProdutoDeTodos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int produtoDeTodos = numeros.stream().reduce(1,(a,b) -> a*b);
        System.out.println("Produto de todos os números " + produtoDeTodos);

    }
}

package exercicios;

import java.util.Scanner;

public class ExPalindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma palavara para verificar se é um palindromo;");
        String palavra = sc.nextLine();
        palavra = palavra.replaceAll(" ", "");
        StringBuilder sb = new StringBuilder();
        sb.append(palavra).reverse();


        System.out.printf("é igual? " + palavra.equalsIgnoreCase(sb.toString()));

    }
}

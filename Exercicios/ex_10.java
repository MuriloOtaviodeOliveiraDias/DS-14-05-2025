package Exercicios;

import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um palavra: ");
        String palavra = sc.nextLine();
        int i = 0;
        while (i < palavra.length()) {
            System.out.println(palavra.charAt(i));
            i++;
        }
    }
    
}

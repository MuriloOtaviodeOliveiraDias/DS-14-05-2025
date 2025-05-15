package Exercicios;

import java.util.Scanner;

public class ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    String senha = "";
    while (!senha.equals("1234")) {
        System.out.println("Digite a senha: ");
        senha = sc.nextLine();
    }
    System.out.println("Senha Correta!");
    }
    
}

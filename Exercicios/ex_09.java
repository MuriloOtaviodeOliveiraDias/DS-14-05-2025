package Exercicios;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, positivos = 0;
     do{
         System.out.println("digite um número (-1 para sair): ");
        num = sc.nextInt();
     if (num > 0) positivos++; 
                
     } while(num != -1);
            System.out.println("Total de números positivos: " + positivos);
        }

    }

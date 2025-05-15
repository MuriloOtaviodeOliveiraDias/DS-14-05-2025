package Exercicios;

import java.util.Scanner;

public class Enquanto {
    public static void main(String[] args) {
        Scanner cc = new Scanner(System.in);
        double produto = 0;
        double total = 0;
        double desc = 0;
        int cont = 1;
   
        while (cont <= 5) {
            System.out.println(cont + " ");
            System.out.print("Digite o valor do produto: ");
            produto = cc.nextDouble();
            System.out.println("produto "+ cont + "valor: " + produto);
            total = total + produto;
            cont++;
        }
 
        if (total < 100) {
            desc = total - ((total/100)*10);
            System.out.println("O valor total com desconto é: "+ desc);
        }else{
            desc = total + ((total/100)*2);
            System.out.println("O valor total do produto é: " + total);
        }
    }
    
}

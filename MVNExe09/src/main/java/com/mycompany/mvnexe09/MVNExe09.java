
package com.mycompany.mvnexe09;

import java.util.Scanner;


public class MVNExe09 {

    public static int CrivoEratostenesSubtracoes(int a, int b){
        
        if(a >= b){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
         if(b < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        while(a != b){
            if (a > b){
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
    public static void main(String[] args) {
       
        int a;
        int b;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de a: ");
        a = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o valor de b: ");
        b = Integer.parseInt(leitor.nextLine());
        
        resultado = CrivoEratostenesSubtracoes(a,b);
        
        System.out.println("O resultado é: " + resultado);
        
    }
    
}

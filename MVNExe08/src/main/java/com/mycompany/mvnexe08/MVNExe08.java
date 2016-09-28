
package com.mycompany.mvnexe08;

import java.util.Scanner;

public class MVNExe08 {

    public static int CrivoEratostenes(int a, int b){
       
        if(a >= b){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
         if(b < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
       int m;
       
       while(b != 0){
           m = a % b;
           a = b;
           b = m;
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
        
        resultado = CrivoEratostenes(a, b);
        
        System.out.println("O resultado é: " + resultado);
    }
    
}

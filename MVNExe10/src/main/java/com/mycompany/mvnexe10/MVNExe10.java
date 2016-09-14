
package com.mycompany.mvnexe10;

import java.util.Scanner;


public class MVNExe10 {

    public static int NumeroHarmonico(int n){
        
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = 2;
        int s = 1;
        
        while (i <= n){
            s = s + (1/i);
            i = i + 1;
        }
        
        return s;
    }
    public static void main(String[] args) {
       
        int n;
        int resultado;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor de n: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = NumeroHarmonico(n);
        
        System.out.println("O resultado é: " + resultado);
        
    }
}

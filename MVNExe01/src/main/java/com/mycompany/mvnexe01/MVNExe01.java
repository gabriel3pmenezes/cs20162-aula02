package com.mycompany.mvnexe01;

import java.util.Scanner;

public class MVNExe01 {

    public static int Soma(int n) {
           
        if (n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int s = 1;
        int i = 2;
        
        while (i <= n){
            s = s + i;
            i = i + 1;
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        
        int n;
        int resultado;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o valor n para calcular a sua soma: ");
        
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Soma(n);
        
        System.out.println("O resultado da soma é: " + resultado);
    }
    
}

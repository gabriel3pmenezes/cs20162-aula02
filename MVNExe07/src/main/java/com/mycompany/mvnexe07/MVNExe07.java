
package com.mycompany.mvnexe07;

import java.util.Scanner;


public class MVNExe07 {

    public static void CrivoEratostenes(int i, int n){
        
        if(n < 1 || n < i){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        if(i < 2){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int x = 0;
        int a[] = new int[x];
        int c;
        int cont;
        
        for(cont = 0; cont < x; cont++){
            a[cont] = 0;
        }
        
        while(i <= (n / 2)){
            if (a[i] == 0){
                c = i + i;
                while(c <= n){
                    a[c] = 1;
                    c = c + 1;
                }
            }
            
            i = i + 1;
        }
    }
    public static void main(String[] args) {
        
        int i;
        int n;
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o número i: ");
        i = Integer.parseInt(leitor.nextLine());
        
        System.out.println("Insira o número n: ");
        n = Integer.parseInt(leitor.nextLine());
        
        CrivoEratostenes(i,n);
     
    }
    
    
}

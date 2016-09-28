
package com.mycompany.mvnexe06;

import java.util.Scanner;


public class MVNExe06 {
    
     public static boolean Primo(int n){
        
        if(n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i;
        int cont = 0;
        
        for (i = 1;i <= n;i++ ){
            if(n % i == 0){
            cont = cont + 1;
            }
        }
        if (cont == 2){
            return true;
        }else{
            return false;
        }   
        
    }
            
    public static void main(String[] args) {
        
        int n;
        boolean resultado;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o número para checar se ele é primo: ");
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Primo(n);
        
        if(resultado == true){
            System.out.println("O número é primo");
        }
        else {
            System.out.println("O número não é primo");
        }
    }
    
    
}


/*

 if(n < 1){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = 2;
        
        while(i <= (n - 1)){
            if(n % i == 0){
                return true;
            }       
        }
        return false;

*/
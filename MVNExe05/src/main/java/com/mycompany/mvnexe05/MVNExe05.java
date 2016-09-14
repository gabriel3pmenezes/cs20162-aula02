
package com.mycompany.mvnexe05;

import java.util.Scanner;

public class MVNExe05 {

    public static boolean Propriedade153(int n){
        
        if ((n < 0) && (n > 9999)){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = n / 100;
        int j = (n - (100 * i)) / 10;
        int k = n % 10;
        
        if (((i*i*i)+(j*j*j)+(k*k*k)) == n){
            return true;
        }
        else {
            return false;
        }
        
    }
    
    public static void main(String[] args) {
        
        int n;
        boolean resultado;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor para conferir a propriedade 153: ");
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Propriedade153(n);
        
        if (resultado == true){
            System.out.println("O número satisfaz a propriedade!");
        }
        else {
            System.out.println("O número não satisfaz a propriedade!");
        }
    }
     
   
    
}

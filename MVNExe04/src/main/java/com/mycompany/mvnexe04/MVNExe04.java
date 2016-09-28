
package com.mycompany.mvnexe04;

import java.util.Scanner;

public class MVNExe04 {

   public static boolean Propriedade3025(int n){
        
        if ((n < 0) || (n > 9999)){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = n / 100;
        int j = n % 100;
        
        if ((i+j)*(i+j) == n){
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
        System.out.println("Insira o valor para conferir a propriedade 3025: ");
        n = Integer.parseInt(leitor.nextLine());
        
        resultado = Propriedade3025(n);
        
        if (resultado == true){
            System.out.println("O número satisfaz a propriedade!");
        }
        else {
            System.out.println("O número não satisfaz a propriedade!");
        }
    }
    
}

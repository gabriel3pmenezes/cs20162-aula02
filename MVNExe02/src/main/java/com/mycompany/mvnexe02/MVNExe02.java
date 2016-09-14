package com.mycompany.mvnexe02;

import java.util.Scanner;

public class MVNExe02 {

   public static int Produto(int a, int b){
        
        if (a < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        if (b < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int i = 1;
        int s = 0;
        int parcela;
        int totalParcelas;
        
        parcela = b;
        totalParcelas = a;
        
        if(b < a){
            parcela = a;
            totalParcelas = b;
        }
        
        while(i <= totalParcelas){
            s = s + parcela;
            i = i + 1;
        }
        
        return s;
    }
    
    public static void main(String[] args) {
        
        int a;
        int b;
        int resultado;
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor: ");
        a = Integer.parseInt(leitor.nextLine());
       
        System.out.println("Insira o segundo valor: ");
        b = Integer.parseInt(leitor.nextLine());
        
        resultado = Produto(a,b);
        
        System.out.println("O resultado do produto é: " + resultado);
    }
    
}

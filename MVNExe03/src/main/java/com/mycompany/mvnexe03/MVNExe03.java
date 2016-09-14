package com.mycompany.mvnexe03;

import java.util.Scanner;

public class MVNExe03 {

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
    
    public static int Potencia(int x, int y){
        
        if (x < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        if (y < 0){
            throw new IllegalArgumentException("Número fora da faixa");
        }
        
        int potencia = 1;
        int i = 1;
        
        while(i <= y){
            potencia = Produto(potencia,x);
            i = i + 1;
        }
        
        return potencia;
    }
    
    public static void main(String[] args) {
       
       int num1;
       int num2;
       int resultado;
       
       Scanner leitor = new Scanner(System.in);
       
        System.out.println("Insira o primeiro valor: ");
        num1 = Integer.parseInt(leitor.nextLine());
        System.out.println("Insira o segundo número: ");
        num2 = Integer.parseInt(leitor.nextLine());
        
        resultado = Potencia(num1, num2);
        
        System.out.println("O resultado da potência é: " + resultado);
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc2022.tarea1;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Recursivo {
    public int invertir(int num, int digito){
        if(num<10){
            return num;
        }else{
            return num%10 * (int)Math.pow(10, digito) + invertir(num/10, digito-1); 
        }
    }
    void letraxletra(char letra ,int digito,String frase){
        if (digito >=(char)frase.length()) {
            return;
        }
        else{
            letra = frase.charAt(digito);
            System.out.println(letra);
            digito++;
            letraxletra(letra,digito,frase);
        } 
    }
    
    public void llenarVector(int[] vector, int num){
        if (num < vector.length){
            vector[num]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            llenarVector(vector, num+1);
        }
    }
    public void mostrarVector(int[] vector, int num){
        if (num < vector.length){
            System.out.print(vector[num]+" ");
            mostrarVector(vector, num+1);
        }
    }
    public int mayorVector(int[] vector, int num,int mayor){
        if (num < vector.length){
            if(vector[num]>mayor){ 
                mayor=vector[num];
            }
            return mayorVector(vector, num+1,mayor);  
        } else{
            return mayor;
        }
    }
    
    public int Nnumeros(int num, int num2){
        if (num > 0){
            num2 = num2+Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
            return Nnumeros(num-1,num2);
        }
        return num2;
    }
    public int Sumadig(int num, int num2 , int digito){
        if (num==0){
            return digito;
        }else{
            num2=num%10;
            num=num/10;
            digito=digito+num2;

            return Sumadig(num,num2,digito);
        }
    }
    
    public void tablas(int num2, int digito, int num ){
        if (digito<11){
            num2=num*digito;
            System.out.print(num+" x "+digito+" = "+num2+"\n");
            digito++;
            tablas(num2,digito,num);
        }

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sc2022.tarea1;

/**
 *
 * @author Usuario
 */
public class Recursivo {
    public int invertir(int num, int digito){
        if(num<10){
            return num;
        }

            if(num<100){
                return (num%10)*(int)Math.pow(10,digito)+(invertir(num/10,digito-1));
                
            }else{
                return (num%10)*(int)Math.pow(10,digito);
            }
    }
}

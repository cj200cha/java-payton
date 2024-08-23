/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.parametros;
import java.util.Scanner;
/**
 *
 * @author Sala de Sistemas 4
 */
public class Parametros {

    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        //varible
        String nombre,apellido;
        int edad,sexo;
        //entrada
        System.out.println("ingrese el nombre");
        nombre = entrada.nextLine();
        System.out.println("ingrese el apellido");
        apellido = entrada.nextLine();
        System.out.println("ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("ingrese el sexo");
        sexo = entrada.nextInt();
        
        if(edad>=0 && edad<=18){
            System.out.println("Es mayor de edad");
    }else{
            System.out.println("Es menor de edad");
            
        }
        if(sexo==1 && sexo!=2)
            System.out.println("Es mujer");
    }else{
            System.out.println(" Es hombre");
        }
    }


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mapas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Standar
 */
public class Mapas {
     private static ArrayList<String> usuarios = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Hello World!");
     Scanner scanner = new Scanner(System.in);
        int opcion;
        
         {
            
            System.out.println("Menú:");
            System.out.println("1. Agregar usuario");
            System.out.println("2. Buscar usuario");
            System.out.println("3. Eliminar Usuario");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); 
            
            switch(opcion) {
                case 1:
                    Agregarusuario(scanner);
                    break;
                case 2:
                    Buscarusuario(scanner);
                    break;
                case 3:
                    Eliminarusuario(scanner);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        } while(opcion != 4);
        
        scanner.close();
    }

    
    private static void Agregarusuario(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario a agregar:CALEB ");
        String nombre = scanner.nextLine();
        usuarios.add(nombre);
        System.out.println("Usuario agregado exitosamente.");
    }

    
    private static void Buscarusuario(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario a buscar: ");
        String nombre = scanner.nextLine();
        if (usuarios.contains(nombre)) {
            System.out.println("Usuario encontrado.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }

    
    private static void Eliminarusuario(Scanner scanner) {
        System.out.print("Ingrese el nombre del usuario a eliminar: ");
        String nombre = scanner.nextLine();
        if (usuarios.remove(nombre)) {
            System.out.println("Usuario eliminado exitosamente.");
        } else {
            System.out.println("Usuario no encontrado.");
        }
    }
}   
    


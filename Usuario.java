/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mapas;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Standar
 */
public class Usuario {
    private Map<String, String> datos;
    
    
  public Usuario(String nombreCompleto, String nickname, String clave, String tipo, String fechaCreacion) {
        datos = new HashMap<>();
        datos.put("nombreCompleto", nombreCompleto);
        datos.put("nickname", nickname);
        datos.put("clave", clave);
        datos.put("tipo", tipo);
        datos.put("fechaCreacion", fechaCreacion);
    }

    // Método para buscar un valor
    public String buscar(String key) {
        return datos.get(key);
    }

    // Método para eliminar un valor
    public void eliminar(String key) {
        datos.remove(key);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Ingrese nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese nickname: ");
        String nickname = scanner.nextLine();

        System.out.print("Ingrese clave: ");
        String clave = scanner.nextLine();

        System.out.print("Ingrese tipo: ");
        String tipo = scanner.nextLine();

        System.out.print("Ingrese fecha de creación: ");
        String fechaCreacion = scanner.nextLine();

        
        Usuario usuario = new Usuario(nombreCompleto, nickname, clave, tipo, fechaCreacion);

        System.out.println("Datos del usuario:");
        System.out.println("Nombre completo: " + usuario.buscar("nombreCompleto"));
        System.out.println("Nickname: " + usuario.buscar("nickname"));
        System.out.println("Clave: " + usuario.buscar("clave"));
        System.out.println("Tipo: " + usuario.buscar("tipo"));
        System.out.println("Fecha de creación: " + usuario.buscar("fechaCreacion"));

       
        System.out.print("Ingrese el atributo a eliminar (nombreCompleto, nickname, clave, tipo, fechaCreacion): ");
        String atributoAEliminar = scanner.nextLine();
        usuario.eliminar(atributoAEliminar);

        System.out.println("Datos del usuario después de la eliminación:");
        System.out.println("Nombre completo: " + usuario.buscar("nombreCompleto"));
        System.out.println("Nickname: " + usuario.buscar("nickname"));
        System.out.println("Clave: " + usuario.buscar("clave"));
        System.out.println("Tipo: " + usuario.buscar("tipo"));
        System.out.println("Fecha de creación: " + usuario.buscar("fechaCreacion"));

        scanner.close();
    }
}
    


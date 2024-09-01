/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empleado;

/**
 *
 * @author Standar
 */
public class Hija extends persona {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private int edad;
    private String email;
    private String nombreCargo;
    private double salario;
    private String jefeInmediato;
    private int añosExperiencia;
   
    
    public Hija(String nombre,String apellido,String direccion,String telefono,int edad,String email, String nombreCargo, double salario, String jefeInmediato, int añosExperiencia) {
        this.nombre= nombre;
        this.apellido=apellido;
        this.direccion=direccion;
        this.telefono=telefono;
        this.edad=edad;
        this.email=email;
        this.nombreCargo = nombreCargo;
        this.salario = salario;
        this.jefeInmediato = jefeInmediato;
        this.añosExperiencia = añosExperiencia;
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the nombreCargo
     */
    public String getNombreCargo() {
        return nombreCargo;
    }

    /**
     * @param nombreCargo the nombreCargo to set
     */
    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the jefeInmediato
     */
    public String getJefeInmediato() {
        return jefeInmediato;
    }

    /**
     * @param jefeInmediato the jefeInmediato to set
     */
    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    /**
     * @return the añosExperiencia
     */
    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    /**
     * 
     */
    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
     private void getAños() {
        int edad = getEdad();
        if (salario >= 5000000 && añosExperiencia >= 5 && edad >= 25 && edad <= 45) {
            nombreCargo = "Senior";
        } else if (salario >= 900000 && salario <= 1200000 && añosExperiencia >= 1 && añosExperiencia <= 2
                   && edad >= 18 && edad <= 22) {
            nombreCargo = "Junior";
        } else {
            nombreCargo = "No definido";
        }
}
}
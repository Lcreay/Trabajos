/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configuracion;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Configuracion config = new Configuracion();
        
        System.out.println("Cargando configuraciones:");
        config.cargarConfiguracion();
        
        System.out.println("\nGuardando configuraciones:");
        config.salvarConfiguracion();
        
        System.out.println("\nNotificando configuraciones:");
        config.notificarConfiguracion();
    }
}

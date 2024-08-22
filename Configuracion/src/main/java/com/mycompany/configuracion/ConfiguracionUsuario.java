/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configuracion;

/**
 *
 * @author User
 */
public class ConfiguracionUsuario implements RecursoPersistente, Notificable {
    
    public void load() {
        System.out.println("Configuracion usuario cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion usuario almacenada");
    }

    @Override
    public void notifyUser() {
        System.out.println("Notificando al usuario sobre la configuración del usuario");
    }
}

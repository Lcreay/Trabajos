/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configuracion;

/**
 *
 * @author User
 */
public class ConfiguracionSistema implements RecursoPersistente, Notificable {
   
    public void load() {
        System.out.println("Configuracion sistema cargada");
    }

    @Override
    public void save() {
        System.out.println("Configuracion sistema almacenada");
    }

    @Override
    public void notifyUser() {
        System.out.println("Notificando al usuario sobre la configuración del sistema");
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.configuracion;

/**
 *
 * @author User
 */
public class ConfiguracionHoraria implements RecursoCargable, Notificable {
    @Override
    public void load() {
        System.out.println("Configuracion horaria cargada");
    }

    @Override
    public void notifyUser() {
        System.out.println("Notificando al usuario sobre la configuración horaria");
    }
}

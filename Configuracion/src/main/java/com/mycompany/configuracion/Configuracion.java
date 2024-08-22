/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.configuracion;

import java.util.Vector;

/**
 *
 * @author User
 */
public class Configuracion {
    private Vector<RecursoCargable> configuraciones = new Vector<>();
    private Vector<RecursoPersistente> persistentes = new Vector<>();
    private Vector<Notificable> notificables = new Vector<>();

    public void cargarConfiguracion() {
        configuraciones.add((RecursoCargable) new ConfiguracionSistema());
        configuraciones.add((RecursoCargable) new ConfiguracionUsuario());
        configuraciones.add(new ConfiguracionHoraria());

        for (RecursoCargable rc : configuraciones) {
            rc.load();
        }
    }

    public void salvarConfiguracion() {
        persistentes.add(new ConfiguracionSistema());
        persistentes.add(new ConfiguracionUsuario());

        for (RecursoPersistente rp : persistentes) {
            rp.save();
        }
    }

    public void notificarConfiguracion() {
        notificables.add(new ConfiguracionSistema());
        notificables.add(new ConfiguracionUsuario());
        notificables.add(new ConfiguracionHoraria());

        for (Notificable n : notificables) {
            n.notifyUser();
        }
    }
}
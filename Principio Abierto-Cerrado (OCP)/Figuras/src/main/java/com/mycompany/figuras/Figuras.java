/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.figuras;

import java.util.Vector;

/**
 *
 * @author User
 */


public class Figuras {
    private Vector<Dibujable> figuras = new Vector<>();

    public void addFigura(Dibujable f) {
        figuras.add(f);
    }

    public void dibujarFiguras() {
        for (Dibujable figura : figuras) {
            figura.dibujar();
        }
    }
}

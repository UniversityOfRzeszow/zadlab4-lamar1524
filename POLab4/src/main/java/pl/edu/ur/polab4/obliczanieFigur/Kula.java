/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author LamaR
 */
public class Kula {

    public double promien;

    public Kula(double promien) {
        this.promien = promien;
    }

    public double pole() {
        return (4 * Math.PI * promien * promien);
    }

    public double objetosc() {
        return (4 / 3) * Math.PI * promien * promien;
    }

    public void PokazDane() {
        System.out.println("Promien tej kuli to: " + promien);
        System.out.println("Pole tej kuli to: " + pole());
        System.out.println("Objetosc tej kuli to: " + objetosc());

    }
}

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
public class Kolo {

    public double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    public double pole() {
        return (Math.PI * (promien * promien));
    }

    public double obwod() {
        return (Math.PI * 2 * promien);
    }

    public void PokazDane() {
        System.out.println("Promien tego kola to: " + promien);
        System.out.println("Obwod tego kola wynosi : " + obwod());
        System.out.println("Pole tego kola wynosi: " + pole());
    }
}

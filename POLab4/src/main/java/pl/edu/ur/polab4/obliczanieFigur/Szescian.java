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
public class Szescian {

    public double DlugoscKrawedzi;

    public Szescian(double DlugoscKrawedzi) {
        this.DlugoscKrawedzi = DlugoscKrawedzi;
    }

    public double pole() {
        return (6 * (DlugoscKrawedzi * DlugoscKrawedzi));
    }

    public double objetosc() {
        return DlugoscKrawedzi * DlugoscKrawedzi * DlugoscKrawedzi;
    }

    public void PokazDane() {
        System.out.println("Dlugosc krawedzi szescianu to: " + DlugoscKrawedzi);
        System.out.println("Pole szescianu to: " + pole());
        System.out.println("Objetosc szescianu to: " + objetosc());
    }
}

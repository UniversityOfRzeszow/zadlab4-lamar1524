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
public class Kwadrat {

    public double ramie;

    public Kwadrat(double ramie) {
        this.ramie = ramie;
    }

    public double pole() {
        return ramie * ramie;
    }

    public double obwod() {
        return 4 * ramie;
    }

    public void PokazDane() {
        System.out.println("Ramie kwadratu jest rowne: " + ramie);
        System.out.println("Obwod tego kwadratu jest rowny: " + obwod());
        System.out.println("Pole tego kwadratu jest rowne: " + pole());
    }
}

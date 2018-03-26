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
public class Prostokat {

    public double ramieA;
    public double ramieB;

    public Prostokat(double ramieA, double ramieB) {
        this.ramieA = ramieA;
        this.ramieB = ramieB;
    }

    public double obwod() {
        return ((2 * ramieA) + (2 * ramieB));
    }

    public double pole() {
        return (ramieA * ramieB);
    }

    public void PokazDane() {
        System.out.println("Ramiona tego prostokata to: " + ramieA + ", oraz: " + ramieB);
        System.out.println("Obwod tego prostokata to: " + obwod());
        System.out.println("Pole teog prostokata to: " + pole());
    }

}

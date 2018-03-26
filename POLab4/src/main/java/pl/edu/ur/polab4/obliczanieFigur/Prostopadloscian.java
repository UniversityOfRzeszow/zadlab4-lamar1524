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
public class Prostopadloscian {

    public double kPodstawyA;
    public double kPodstawyB;
    public double wysokosc;

    public Prostopadloscian(double kPodstawyA, double kPodstawyB, double wysokosc) {
        this.kPodstawyA = kPodstawyA;
        this.kPodstawyB = kPodstawyB;
        this.wysokosc = wysokosc;
    }

    public double pole() {
        return ((kPodstawyA * kPodstawyB) * 2) + (2 * kPodstawyA * wysokosc) + (2 * kPodstawyB * wysokosc);
    }

    public double objetosc() {
        return (kPodstawyA * kPodstawyB * wysokosc);
    }

    public void PokazDane() {
        System.out.println("Krawedzi tego prostopadloscianu to: " + kPodstawyA + ", oraz: " + kPodstawyB + ", a takze wysokosc: " + wysokosc);
        System.out.println("Pole tego prostopadloscianu to : " + pole());
        System.out.println("Objetosc tego prostopadloscianu to: " + objetosc());
    }
}

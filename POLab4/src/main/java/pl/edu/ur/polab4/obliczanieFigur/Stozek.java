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
public class Stozek {

    public double rPodstawy;
    public double tworzaca;
    public double wysokosc;

    public Stozek(double rPodstawy, double tworzaca, double wysokosc) {
        this.rPodstawy = rPodstawy;
        this.tworzaca = tworzaca;
        this.wysokosc = wysokosc;
    }

    public double pole() {
        return (Math.PI * rPodstawy * rPodstawy) + (Math.PI * rPodstawy * tworzaca);
    }
    public double objetosc(){
        return ((Math.PI*(rPodstawy*rPodstawy)*wysokosc)/3);
    }
    public void PokazDane(){
        System.out.println("Promien podstawy stozka: " + rPodstawy);
        System.out.println("Tworzaca stozka: " + tworzaca);
        System.out.println("Wysokosc stozka: " + wysokosc);
        System.out.println("Pole stozka; " + pole());
        System.out.println("Objetosc stozka: " + objetosc());
    }
}

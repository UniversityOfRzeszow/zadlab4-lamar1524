/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author LamaR
 */
public class Student {

    public String imie;
    public String nazwisko;
    public int nrindeksu;
    public String specjalnosc;
    public int rok;

    public Student(String imie, String nazwisko, int nrindeksu, String specjalnosc, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
        this.specjalnosc = specjalnosc;
        this.rok = rok;
    }

    public Student(String imie, String nazwisko, int nrindeksu, String specjalnosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
        this.specjalnosc = specjalnosc;
    }

    public Student(String imie, String nazwisko, int nrindeksu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrindeksu = nrindeksu;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Student() {
    }
    

    public void pokazDaneS() {
        System.out.println("Student");
        System.out.println("imię: " + this.imie);
        System.out.println("nazwisko: " + this.nazwisko);
        System.out.println("rok: " + this.rok);
        System.out.println("specjalnosc: " + this.specjalnosc);
        System.out.println("nr Indeksu: " + this.nrindeksu);
    }
}

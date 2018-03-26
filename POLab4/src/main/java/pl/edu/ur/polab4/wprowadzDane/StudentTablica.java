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
import java.util.Scanner;
public class StudentTablica {

    public String imie;
    public String nazwisko;
    public int nrindeksu;
    public String specjalnosc;
    public int rok;

    public void setDefaults(){
        imie = " ";
        nazwisko = " ";
        nrindeksu = 0;
        specjalnosc = " ";
        rok = 0;
    }
    public void implement() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj Imie");
        imie = in.next();
        System.out.println("Podaj nazwisko");
        nazwisko = in.next();
        System.out.println("Podaj nr indeksu");
        nrindeksu = in.nextInt();
        System.out.println("Podaj specjalnosc");
        specjalnosc = in.next();
        System.out.println("Podaj rok na ktory uczeszcza student");
        rok = in.nextInt();
    }

    public void edit() {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj Imie");
        imie = in.next();
        System.out.println("Podaj nazwisko");
        nazwisko = in.next();
        System.out.println("Podaj nr indeksu");
        nrindeksu = in.nextInt();
        System.out.println("Podaj specjalnosc");
        specjalnosc = in.next();
        System.out.println("Podaj rok na ktory uczeszcza student");
        rok = in.nextInt();
    }

    public void delete() {
        imie = " ";
        nazwisko = " ";
        nrindeksu = 0;
        specjalnosc = " ";
        rok = 0;
    }

    public void display() {
        System.out.println("-------------------------------------------");
        System.out.println("imię: " + imie);
        System.out.println("nazwisko: " + nazwisko);
        System.out.println("rok: " + rok);
        System.out.println("specjalnosc: " + specjalnosc);
        System.out.println("nr Indeksu: " + nrindeksu);
        System.out.println("-------------------------------------------");
    }

    public StudentTablica() {
    }

}

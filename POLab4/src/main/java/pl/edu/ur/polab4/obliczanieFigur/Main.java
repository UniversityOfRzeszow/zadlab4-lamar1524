package pl.edu.ur.polab4.obliczanieFigur;

import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        System.out.println("Podaj jakiej figury feature'y chcesz obliczyc(Kolo,Kula,Kwadrat,Prostokat,Prostopadloscian,Stozek,Szescian");
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        if (c.equalsIgnoreCase("kolo")) {
            System.out.println("Podaj promien Kola");
            double r = in.nextDouble();
            Kolo kolo = new Kolo(r);
            kolo.PokazDane();
        }
        if (c.equalsIgnoreCase("kula")) {
            System.out.println("Podaj promien Kuli");
            double r = in.nextDouble();
            Kula kula = new Kula(r);
            kula.PokazDane();
        }
        if (c.equalsIgnoreCase("kwadrat")) {
            System.out.println("Podaj bok kwadratu");
            double a = in.nextDouble();
            Kwadrat kwadrat = new Kwadrat(a);
            kwadrat.PokazDane();
        }
        if (c.equalsIgnoreCase("prostokat")) {
            System.out.println("Podaj pierwszy bok prostokata");
            double a = in.nextDouble();
            System.out.println("Podaj drugi bok prostokata");
            double b = in.nextDouble();
            Prostokat prostokat = new Prostokat(a, b);
            prostokat.PokazDane();
        }
        if (c.equalsIgnoreCase("prostopadloscian")) {
            System.out.println("Podaj pierwsza krawedz podstawy");
            double a = in.nextDouble();
            System.out.println("Podaj druga krawedz podstawy");
            double b = in.nextDouble();
            System.out.println("Podaj wysokosc");
            double h = in.nextDouble();
            Prostopadloscian pro = new Prostopadloscian(a, b, h);
            pro.PokazDane();
        }
        if (c.equalsIgnoreCase("szescian")) {
            System.out.println("Podaj krawedz szescianu");
            double a = in.nextDouble();
            Szescian szesc = new Szescian(a);
            szesc.PokazDane();
        }
        if (c.equalsIgnoreCase("Stozek")) {
            System.out.println("Podaj promien podstawy stozka");
            double r = in.nextDouble();
            System.out.println("Podaj tworzaca stozka");
            double l = in.nextDouble();
            System.out.println("Podaj wysokosc");
            double h = in.nextDouble();
            Stozek stozek = new Stozek(r, l, h);
            stozek.PokazDane();
        }
        else{
            System.out.println("Nie ma takiej figury w danych zadania");
        }
    }

}

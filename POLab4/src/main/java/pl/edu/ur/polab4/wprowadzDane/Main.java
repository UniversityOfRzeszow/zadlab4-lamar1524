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
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        StudentTablica[] studenci = new StudentTablica[100];
        for (int i = 0; i < 100; i++) {
            studenci[i] = new StudentTablica();
        }
        for (int j = 0; j < 100; j++) {
            studenci[j].setDefaults();
        }
        System.out.println("Podaj co chcesz zrobic z danymi studenta");
        System.out.println("wprowadzanie danych studenta pod wybrany index tablicy - 1");
        System.out.println("edycję (nadpisanie danych studenta) spod wybranego indeksu - 2");
        System.out.println("usunięcie danych studenta (tj. nadpisanie elementów tablicy wartościami domyślnymi) - 3 ");
        System.out.println("wyświetlenie obiektu o danym indeksie - 4 ");
        System.out.println("wyświetlenie wszystkich obiektów - 5 ");
        System.out.println("wyświetlenie zakresu obiektów w podanym zakresie - 6");
        int k = in.nextInt();
        switch (k) {
            case 1: {
                System.out.println("Podaj nr studenta ktorego dane chcesz wprowadzic");
                int i = in.nextInt();
                studenci[i].implement();
                break;
            }
            case 2: {
                System.out.println("Podaj nr studenta ktorego dane chcesz edytowac");
                int i = in.nextInt();
                studenci[i].edit();
                break;
            }
            case 3: {
                System.out.println("Podaj nr studenta ktorego dane chcesz usunac");
                int i = in.nextInt();
                studenci[i].delete();
            }
            case 4: {
                System.out.println("Podaj nr studenta ktorego dane chcesz wyswietlic");
                int i = in.nextInt();
                System.out.println("Student nr " + i);
                studenci[i].display();
                break;
            }
            case 5: {
                for (int i = 0; i < 100; i++) {
                    System.out.println("Student nr " + i);
                    studenci[i].display();
                }
                break;
            }
            default: {
                System.out.println("Zle wybrales metode, bystrzaku");
            }
            case 6: {
                System.out.println("Podaj lewy brzeg zakresu z ktorego chcesz wyswietlic dane studentow");
                int a = in.nextInt();
                System.out.println("Podaj prawy brzeg zakresu z ktorego chcesz wyswietlic dane studentow");
                int b = in.nextInt();
                for (int i = a; i <= b; i++) {
                    System.out.println("Student nr " + i);
                    studenci[i].display();
                }

            }

        }
    }
}

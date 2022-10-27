package ba.etf.unsa.rpr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    List<Double> lista = new ArrayList<>(){};

        while(true){
            System.out.println("Unesite elemente liste: ");
            Scanner unos = new Scanner(System.in);
            var next = unos.nextLine();
            if(next.equals("stop")) break;
            try{
                Double x = Double.parseDouble(next);
            }catch(Exception n){
                continue;
            }
            lista.add(Double.valueOf(next));

        }

        System.out.println("Najmanji element je: " + Statistika.min(lista));
        System.out.println("Najveci element je: " + Statistika.max(lista));
        System.out.println("Prosjecna vrijednost svih elemenata u listi je: " + Statistika.mean(lista));
        System.out.println("Standardna devijacija je: " + Statistika.standardnaDevijacija(lista));




    }
}
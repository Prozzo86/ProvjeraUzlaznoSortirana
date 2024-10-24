import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    /*
     * Napravati funkciju koja ce provjeravati da li je lista uzlazno sortirana.
     * Prethodno listu popunjava korisnik svojim unosima.
     * Funkcija treba vratiti true ili false
     * Na kraju programa korisniku ispisati jeli lista sortirana ili nije.
     */

    public class Main {
        public static void main(String[] args) {
            // Kreiranje skenera za unos podataka
            Scanner scanner = new Scanner(System.in);
            List<Integer> lista = new ArrayList<>();

            // Unos veličine liste
            System.out.println("Unesite broj elemenata liste:");
            int velicina = scanner.nextInt();

            // Unos elemenata u listu
            System.out.println("Unesite " + velicina + " elemenata:");
            for (int i = 0; i < velicina; i++) {
                int broj = scanner.nextInt();
                lista.add(broj);
            }

            // Provjera da li je lista sortirana
            boolean sortirana = daLiJeSortirana(lista);

            // Ispis rezultata korisniku
            if (sortirana) {
                System.out.println("Lista je uzlazno sortirana.");
            } else {
                System.out.println("Lista nije uzlazno sortirana.");
            }

            scanner.close();
        }

        // Funkcija koja provjerava da li je lista uzlazno sortirana
        public static boolean daLiJeSortirana(List<Integer> lista) {
            for (int i = 0; i < lista.size() - 1; i++) {
                if (lista.get(i) > lista.get(i + 1)) {
                    return false; // Ako nađemo bilo koji element koji nije u pravilnom poretku, lista nije sortirana
                }
            }
            return true; // Ako su svi elementi u pravilnom poretku, lista je sortirana
        }
    }

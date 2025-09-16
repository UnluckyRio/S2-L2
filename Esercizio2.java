import java.util.*;

public class Esercizio2 {
    
    /**
     * Funzione che accetta un numero intero N e restituisce una lista ordinata
     * di N numeri interi casuali compresi tra 0 e 100.
     * @param n il numero di elementi da generare
     * @return lista ordinata di numeri casuali
     */
    public static List<Integer> generaListaOrdinata(int n) {
        List<Integer> lista = new ArrayList<>();
        Random random = new Random();
        
        // Genera N numeri casuali tra 0 e 100
        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(101)); // 0-100 inclusi
        }
        
        // Ordina la lista
        Collections.sort(lista);
        
        return lista;
    }
    
    /**
     * Funzione che accetta una lista e restituisce una nuova lista
     * composta dagli elementi della prima lista, seguiti dagli stessi elementi in ordine inverso.
     * @param lista la lista originale
     * @return nuova lista con elementi originali + elementi in ordine inverso
     */
    public static List<Integer> creaListaConInverso(List<Integer> lista) {
        List<Integer> nuovaLista = new ArrayList<>(lista);
        
        // Crea una copia della lista originale e la inverte
        List<Integer> listaInversa = new ArrayList<>(lista);
        Collections.reverse(listaInversa);
        
        // Aggiunge gli elementi invertiti alla nuova lista
        nuovaLista.addAll(listaInversa);
        
        return nuovaLista;
    }
    
    /**
     * Funzione che accetta una lista e un valore booleano:
     * se true, stampa i valori nelle posizioni pari;
     * se false, stampa i valori nelle posizioni dispari.
     * @param lista la lista da cui stampare gli elementi
     * @param stampaPari se true stampa posizioni pari, se false stampa posizioni dispari
     */
    public static void stampaElementiPerPosizione(List<Integer> lista, boolean stampaPari) {
        System.out.println("\nElementi nelle posizioni " + (stampaPari ? "pari" : "dispari") + ":");
        
        for (int i = 0; i < lista.size(); i++) {
            // Le posizioni pari hanno indice 0, 2, 4, ...
            // Le posizioni dispari hanno indice 1, 3, 5, ...
            if (stampaPari && i % 2 == 0) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            } else if (!stampaPari && i % 2 == 1) {
                System.out.println("Posizione " + i + ": " + lista.get(i));
            }
        }
    }
    
    /**
     * Funzione main che utilizza tutte e tre le funzioni
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Chiede all'utente quanti numeri generare
        System.out.print("Inserisci il numero N di elementi da generare: ");
        int n = scanner.nextInt();
        
        // 1. Genera una lista ordinata di N numeri casuali
        System.out.println("\n=== FUNZIONE 1: Generazione lista ordinata ===");
        List<Integer> listaOriginale = generaListaOrdinata(n);
        System.out.println("Lista ordinata generata: " + listaOriginale);
        
        // 2. Crea una nuova lista con elementi originali + elementi in ordine inverso
        System.out.println("\n=== FUNZIONE 2: Lista con elementi + inverso ===");
        List<Integer> listaConInverso = creaListaConInverso(listaOriginale);
        System.out.println("Lista originale: " + listaOriginale);
        System.out.println("Lista con inverso: " + listaConInverso);
        
        // 3. Stampa elementi in posizioni pari
        System.out.println("\n=== FUNZIONE 3: Stampa per posizione ===");
        stampaElementiPerPosizione(listaConInverso, true);
        
        // 3. Stampa elementi in posizioni dispari
        stampaElementiPerPosizione(listaConInverso, false);
        
        // Esempio interattivo
        System.out.println("\n=== ESEMPIO INTERATTIVO ===");
        System.out.print("Vuoi stampare le posizioni pari (true) o dispari (false)? ");
        boolean sceltaUtente = scanner.nextBoolean();
        stampaElementiPerPosizione(listaConInverso, sceltaUtente);
        
        scanner.close();
    }
}
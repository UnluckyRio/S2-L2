import java.util.*;

public class Esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Chiede all'utente il numero di parole da inserire
        System.out.print("Inserisci il numero di parole N: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consuma il carattere di nuova linea
        
        // Set per memorizzare tutte le parole (elimina automaticamente i duplicati)
        Set<String> paroleDistinte = new HashSet<>();
        
        // Lista per memorizzare tutte le parole inserite (inclusi i duplicati)
        List<String> tutteLeParole = new ArrayList<>();
        
        // Set per memorizzare le parole duplicate
        Set<String> paroleDuplicate = new HashSet<>();
        
        // Raccoglie le parole dall'utente
        System.out.println("Inserisci " + n + " parole:");
        for (int i = 0; i < n; i++) {
            System.out.print("Parola " + (i + 1) + ": ");
            String parola = scanner.nextLine().trim();
            
            // Se la parola è già presente nel set delle parole distinte,
            // significa che è un duplicato
            if (!paroleDistinte.add(parola)) {
                paroleDuplicate.add(parola);
            }
            
            tutteLeParole.add(parola);
        }
        
        // Stampa le parole duplicate
        System.out.println("\n=== RISULTATI ===");
        System.out.println("Parole duplicate:");
        if (paroleDuplicate.isEmpty()) {
            System.out.println("Nessuna parola duplicata trovata.");
        } else {
            for (String parola : paroleDuplicate) {
                System.out.println("- " + parola);
            }
        }
        
        // Stampa il numero di parole distinte
        System.out.println("\nNumero di parole distinte: " + paroleDistinte.size());
        
        // Stampa l'elenco delle parole distinte
        System.out.println("\nElenco delle parole distinte:");
        for (String parola : paroleDistinte) {
            System.out.println("- " + parola);
        }
        
        scanner.close();
    }
}
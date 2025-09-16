import java.util.*;

/**
 * Classe per gestire una rubrica telefonica utilizzando HashMap.
 * Le chiavi sono i nomi delle persone e i valori sono i numeri di telefono.
 */
class RubricaTelefonica {
    // HashMap per memorizzare i contatti: Nome -> Numero di telefono
    private HashMap<String, String> contatti;
    
    /**
     * Costruttore della rubrica telefonica
     */
    public RubricaTelefonica() {
        this.contatti = new HashMap<>();
    }
    
    /**
     * Inserisce una coppia <Nome, telefono> nella rubrica.
     * Se il nome esiste già, aggiorna il numero di telefono.
     * @param nome il nome della persona
     * @param telefono il numero di telefono
     */
    public void inserisciContatto(String nome, String telefono) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Errore: Il nome non può essere vuoto.");
            return;
        }
        if (telefono == null || telefono.trim().isEmpty()) {
            System.out.println("Errore: Il numero di telefono non può essere vuoto.");
            return;
        }
        
        String vecchioTelefono = contatti.put(nome.trim(), telefono.trim());
        if (vecchioTelefono != null) {
            System.out.println("Contatto aggiornato: " + nome + " (" + vecchioTelefono + " -> " + telefono + ")");
        } else {
            System.out.println("Contatto inserito: " + nome + " - " + telefono);
        }
    }
    
    /**
     * Cancella una coppia <Nome, telefono> dalla rubrica a partire dal nome.
     * @param nome il nome della persona da rimuovere
     * @return true se il contatto è stato rimosso, false se non esisteva
     */
    public boolean cancellaContatto(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Errore: Il nome non può essere vuoto.");
            return false;
        }
        
        String telefonoRimosso = contatti.remove(nome.trim());
        if (telefonoRimosso != null) {
            System.out.println("Contatto rimosso: " + nome + " - " + telefonoRimosso);
            return true;
        } else {
            System.out.println("Contatto non trovato: " + nome);
            return false;
        }
    }
    
    /**
     * Ricerca una persona conoscendo il suo numero di telefono.
     * @param telefono il numero di telefono da cercare
     * @return il nome della persona o null se non trovato
     */
    public String ricercaPerTelefono(String telefono) {
        if (telefono == null || telefono.trim().isEmpty()) {
            System.out.println("Errore: Il numero di telefono non può essere vuoto.");
            return null;
        }
        
        // Cerca il telefono tra tutti i valori della HashMap
        for (Map.Entry<String, String> entry : contatti.entrySet()) {
            if (entry.getValue().equals(telefono.trim())) {
                return entry.getKey();
            }
        }
        return null;
    }
    
    /**
     * Ricerca del numero di telefono di una persona conoscendo il suo nome.
     * @param nome il nome della persona
     * @return il numero di telefono o null se non trovato
     */
    public String ricercaPerNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            System.out.println("Errore: Il nome non può essere vuoto.");
            return null;
        }
        
        return contatti.get(nome.trim());
    }
    
    /**
     * Stampa tutti i contatti, mostrando sia il nome che il numero.
     */
    public void stampaContatti() {
        if (contatti.isEmpty()) {
            System.out.println("La rubrica è vuota.");
            return;
        }
        
        System.out.println("\n=== RUBRICA TELEFONICA ===");
        System.out.println("Totale contatti: " + contatti.size());
        System.out.println("----------------------------");
        
        // Ordina i contatti per nome per una visualizzazione più ordinata
        List<String> nomiOrdinati = new ArrayList<>(contatti.keySet());
        Collections.sort(nomiOrdinati);
        
        for (String nome : nomiOrdinati) {
            System.out.println(nome + " -> " + contatti.get(nome));
        }
        System.out.println("----------------------------");
    }
    
    /**
     * Restituisce il numero di contatti nella rubrica.
     * @return il numero di contatti
     */
    public int getNumeroContatti() {
        return contatti.size();
    }
}

/**
 * Classe principale per testare la rubrica telefonica
 */
public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RubricaTelefonica rubrica = new RubricaTelefonica();
        
        // Menu interattivo
        while (true) {
            System.out.println("\n=== MENU RUBRICA TELEFONICA ===");
            System.out.println("1. Inserisci contatto");
            System.out.println("2. Cancella contatto");
            System.out.println("3. Cerca per numero di telefono");
            System.out.println("4. Cerca per nome");
            System.out.println("5. Stampa tutti i contatti");
            System.out.println("6. Esci");
            System.out.print("Scegli un'opzione (1-6): ");
            
            int scelta = scanner.nextInt();
            scanner.nextLine(); // Consuma il carattere di nuova linea
            
            switch (scelta) {
                case 1:
                    System.out.print("Inserisci il nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Inserisci il numero di telefono: ");
                    String telefono = scanner.nextLine();
                    rubrica.inserisciContatto(nome, telefono);
                    break;
                    
                case 2:
                    System.out.print("Inserisci il nome da cancellare: ");
                    String nomeDaCancellare = scanner.nextLine();
                    rubrica.cancellaContatto(nomeDaCancellare);
                    break;
                    
                case 3:
                    System.out.print("Inserisci il numero di telefono da cercare: ");
                    String telefonoDaCercare = scanner.nextLine();
                    String nomeTrovato = rubrica.ricercaPerTelefono(telefonoDaCercare);
                    if (nomeTrovato != null) {
                        System.out.println("Numero " + telefonoDaCercare + " appartiene a: " + nomeTrovato);
                    } else {
                        System.out.println("Numero " + telefonoDaCercare + " non trovato nella rubrica.");
                    }
                    break;
                    
                case 4:
                    System.out.print("Inserisci il nome da cercare: ");
                    String nomeDaCercare = scanner.nextLine();
                    String telefonoTrovato = rubrica.ricercaPerNome(nomeDaCercare);
                    if (telefonoTrovato != null) {
                        System.out.println(nomeDaCercare + " -> " + telefonoTrovato);
                    } else {
                        System.out.println("Nome " + nomeDaCercare + " non trovato nella rubrica.");
                    }
                    break;
                    
                case 5:
                    rubrica.stampaContatti();
                    break;
                    
                case 6:
                    System.out.println("Arrivederci!");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }
    }
}
# S2-L2 - Esercizi sulle Collezioni Java

Questo progetto contiene tre esercizi pratici per acquisire dimestichezza con le principali interfacce delle collezioni Java: **Set**, **List** e **Map**.

## 📋 Contenuto del Progetto

### Esercizio #1 - HashSet e Gestione Parole Duplicate
**File:** `Esercizio1.java`

**Obiettivo:** Acquisire dimestichezza con l'interfaccia `Set` e l'implementazione `HashSet`.

**Funzionalità:**
- Richiede all'utente di inserire N parole
- Identifica e stampa tutte le parole duplicate
- Calcola e mostra il numero di parole distinte
- Visualizza l'elenco completo delle parole distinte

**Esecuzione:**
```bash
javac Esercizio1.java
java Esercizio1
```

### Esercizio #2 - ArrayList e Manipolazione Liste
**File:** `Esercizio2.java`

**Obiettivo:** Acquisire dimestichezza con l'interfaccia `List` e l'implementazione `ArrayList`.

**Funzioni implementate:**
1. **`generaListaOrdinata(int n)`** - Genera una lista ordinata di N numeri casuali (0-100)
2. **`creaListaConInverso(List<Integer> lista)`** - Crea una nuova lista con elementi originali + elementi in ordine inverso
3. **`stampaElementiPerPosizione(List<Integer> lista, boolean stampaPari)`** - Stampa elementi in posizioni pari o dispari

**Esecuzione:**
```bash
javac Esercizio2.java
java Esercizio2
```

### Esercizio #3 - HashMap e Rubrica Telefonica
**File:** `Esercizio3.java`

**Obiettivo:** Creare una classe per gestire una rubrica telefonica utilizzando `HashMap`.

**Classe `RubricaTelefonica` - Operazioni disponibili:**
- ➕ **Inserimento** di una coppia <Nome, telefono>
- ❌ **Cancellazione** di un contatto tramite nome
- 🔍 **Ricerca persona** tramite numero di telefono
- 📞 **Ricerca numero** tramite nome della persona
- 📋 **Stampa** di tutti i contatti ordinati per nome

**Caratteristiche:**
- Menu interattivo completo
- Gestione errori e validazione input
- Visualizzazione ordinata dei contatti

**Esecuzione:**
```bash
javac Esercizio3.java
java Esercizio3
```

## 🛠️ Tecnologie Utilizzate

- **Java** - Linguaggio di programmazione
- **HashSet** - Per gestire collezioni senza duplicati
- **ArrayList** - Per liste dinamiche ordinate
- **HashMap** - Per associazioni chiave-valore
- **Scanner** - Per input utente
- **Collections** - Per operazioni di ordinamento

## 📚 Concetti Appresi

- **Set Interface:** Gestione di collezioni senza duplicati
- **List Interface:** Manipolazione di liste ordinate e indicizzate
- **Map Interface:** Associazioni chiave-valore per strutture dati complesse
- **Algoritmi di ricerca:** Ricerca lineare e per chiave
- **Gestione input/output:** Interazione con l'utente tramite console
- **Validazione dati:** Controllo e gestione errori input utente

## 🚀 Come Eseguire

1. **Compilazione:**
   ```bash
   javac Esercizio1.java
   javac Esercizio2.java
   javac Esercizio3.java
   ```

2. **Esecuzione:**
   ```bash
   java Esercizio1
   java Esercizio2
   java Esercizio3
   ```

## 📝 Note

- Tutti gli esercizi includono commenti dettagliati in italiano
- La gestione degli errori è implementata per una migliore user experience
- I programmi sono interattivi e guidano l'utente attraverso le operazioni disponibili
- Il codice segue le best practices Java per leggibilità e manutenibilità
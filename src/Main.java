//Scrivere una funzione che restituisca un hashset riempito
//        Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
//        Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
//        Svuotare l'hashset, verificarlo e stampare il risultato


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creare un oggetto HashSet e popolarlo
        HashSet<String> hashSet = creaHashSet();

        // Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
        HashSet<String> oggettoCreato = new HashSet<>();
        oggettoCreato.add("Elemento1");
        for (String elemento: hashSet) {
            if (oggettoCreato.equals(elemento)) {
               hashSet.remove(elemento);
               break;
            }

        }
        hashSet.clear();
        // Verificare e stampare il risultato
        if (hashSet.isEmpty()) {
            System.out.println("L'HashSet è vuoto.");
        } else {
            System.out.println("L'HashSet non è vuoto.");
        }
    }

public static HashSet<String> creaHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("elemento1");
    return hashSet;
}
}

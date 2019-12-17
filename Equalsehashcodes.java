class Equalsehashcodes{
  public static void main(String[] args) {
    //assegnazione per string literal
    String stringaUno = "Ada";
    String stringaDue = "Ada";

    //assegnazione per parola chiave new
    String stringaTre = new String("Ada"); // crea due oggetti(uno in heap e uno nel pool di stringhe) e la variabile di riferimento che punta all'oggetto nell'heap.
    String stringaQuattro = new String("Ada");

    // quando un nuovo oggetto viene creato, la pool di stringhe prima controlla se già esiste;
    //in questo caso passa il riferimento all'oggetto già esistente alla variabile;
    //altrimenti crea un nuovo oggetto.

    System.out.println(stringaUno == stringaDue); // porta true perchè Ada è già contenuto nel pool di Stringhe e quindi stringaDue riceve lo stesso riferimento contenuto in stringaUno
    System.out.println(stringaUno.equals(stringaDue)); // equals controlla il valore effettivo degli oggetti controllati piuttosto che il loro riferimento
    System.out.println(stringaUno.hashCode());//65662
    System.out.println(stringaDue.hashCode());//quando viene chiamato più volte su uno stesso oggetto hashCode deve riportare lo stesso valore

    System.out.println(stringaTre == stringaQuattro); // controlla due oggetti che pur contenendo la stessa parola non sono lo stesso, non puntano allo stesso spazio in memoria
    System.out.println(stringaUno.equals(stringaQuattro));
    System.out.println(stringaTre.hashCode());//per generare l'hashCode viene moltiplicato il valore dell'oggetto a un intero
    System.out.println(stringaQuattro.hashCode());//questi hashcode portano sempre lo stesso numero perchè ogni variabile stringa si riferisce alla parola Ada che è contenuta nella string pool
  }
}

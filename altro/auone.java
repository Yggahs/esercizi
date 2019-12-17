/*scrivere un algoritmo basato sulle strutture di controllo fondamentali che riceva in input 
una sequenza di numeri e produca in uscita il prodotto dei numeri letti. Supponete che 
l'inserimento del numero zero indichi la fine della sequenza*/

import java.util.Scanner;

 class unopuntonove {
    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

    int numeroDue,Prodotto = 0;
        
        System.out.println("Inserisci un integer");
        Prodotto = input.nextInt();
        if(Prodotto == 0)
        {
            input.close();
            return;
        }
        else
        {
            do
            {
                System.out.println("Inserisci un'altro integer");
                numeroDue = input.nextInt();
                if(numeroDue == 0)
                {
                    break;
                }
                else
                {
                    Prodotto *= numeroDue;
                }
            }while(numeroDue != 0);
        }
        input.close();
        System.out.println("Il prodotto dei numeri inseriti è:  "+Prodotto);
    }
}


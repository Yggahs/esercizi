/*scrivere un algoritmo he riceva in ingresso una sequenza di numeri interi
e produca in uscita la somma dei numeri di posto pari e la somma dei numeri di
posto dispati contenuti nela sequenza. zero termina la sequenza*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.graalvm.compiler.lir.amd64.vector.AMD64VectorShuffle.Insert128Op;

class unopuntoundici
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        int Inserito = 0;
        int SequenzaPari = 0;
        int SequenzaDispari = 0;

        List<Integer> ints = new ArrayList<Integer>();
        
        
        do{
            System.out.println("Inserisci un integer");
            Inserito = input.nextInt();
            ints.add(Inserito);
        }while(Inserito != 0);
        input.close();
        for(int i =0;i<=ints.size()-1;i++)
        {
            if(i%2 == 0) //even
            {
                SequenzaPari+=ints.indexOf(i);
            }
            else //odd
            {
                SequenzaDispari+=ints.indexOf(i);
            }
        }
        
        System.out.println("somma numeri in posti pari: "+SequenzaPari);
        System.out.println("somma numeri in posti dispari: "+SequenzaDispari);
    }
}
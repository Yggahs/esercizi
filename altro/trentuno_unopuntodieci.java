/*Scirvete un algoritmo che riceva in ingresso una sequenza di numeri interi 
e produca in uscita la smma dei numeri pari e la somma dei numeri dispari 
contenuti nella sequenza. Zero termina la sequenza.*/
import java.util.Scanner;

class unopuntodieci
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        
        int numeriPari = 0;
        int numeriDispari = 0;
        int numeroInserito = 0;

        do
            {
                System.out.println("Inserisci un integer");
                numeroInserito = input.nextInt();
                if(numeroInserito == 0)
                {
                    break;
                }
                else
                {
                    if(numeroInserito % 2 == 0) // even
                    {
                        numeriPari+=numeroInserito;
                    }
                    else //odd
                    {
                        numeriDispari+=numeroInserito;
                    }
                }
            }while(numeriPari != 0 || numeriDispari != 0);
            input.close();
            System.out.println("Somma numeri pari: "+numeriPari);
            System.out.println("Somma numeri dispari: "+numeriDispari);
    }
}
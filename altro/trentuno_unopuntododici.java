import java.util.Scanner;

/* Scrivere un algoritmo che riceva in ingresso una sequenza 
di numeri interi e riporti in uscita il più grande 
e il più piccolo tra i numeri letti. 
Zero indica la fine della sequenza*/ 

class unopuntotredici
{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int Inserito=0;
        int Max=0;
        int Min=0;
        do{
        System.out.println("Inserisci un numero");
        Inserito = input.nextInt();
        if(Inserito>Max && Inserito != 0)
        {
            Max = Inserito;
        }

        if(Inserito<Min && Inserito != 0)
        {
            Min = Inserito;
        }
        }while(Inserito!=0);
        input.close();
        System.out.println("Numero più grande: "+Max);
        System.out.println("Numero più piccolo: "+Min);

    }
}
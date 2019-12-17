import java.util.Scanner;
class Stringhe
{
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        Scanner input2 = new Scanner (System.in);
        System.out.println("Inserisci la prima stringa");
        String s1 = input.nextLine();
        System.out.println("Inserisci la seconda stringa");
        String s2 = input.nextLine();
        System.out.println("la lunghezza di "+s1+" è: "+ s1.length());
        System.out.println("la lunghezza di "+s2+" è: "+ s2.length());
        
        int modulo = s1.length()%s2.length();
        if(modulo == 0)
        {
            System.out.println("La media di lettere è "+(s1.length()+s2.length()/2));

        }else
        {
            Frazione frazione = new Frazione(s1.length()+s2.length(),2);
            System.out.println("La media di lettere è "+frazione.toString());
        }
        
    }
}


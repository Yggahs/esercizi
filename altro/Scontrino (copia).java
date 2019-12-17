import prog.io.*;

class Scontrino{
    ConsoleOutputManager out = new ConsoleOutputManager();
    ConsoleInputManager in = new ConsoleInputManager();
    float somma,sconto,totale,totaleScontato,totaleLire,prezzoMax,prezzoScontato = 0;
    int nElementi;
    float[] prezzi = new float[nElementi];

    public void scontrino(int x, float[] y){
        nElementi = x;
        prezzi = y.clone();
    }

    public float calcoloTotale(){
        for(int i = 0; i<nElementi;i++){
            totale += prezzi[i];
        }
        out.println("Il totale è ");
        out.printf("%.2f",totale);
        return totale;
    }
    public float calcoloSconto(){
        out.println("\nSconto? ");
        sconto = (float)in.readDouble();
        for(int i = 0; i<nElementi; i++){
            if(prezzi[i]>prezzoMax){
                prezzoMax = prezzi[i];
            }
        }
        prezzoScontato = prezzoMax-(prezzoMax*(sconto/100));
        out.println("\nSCONTO "+sconto+"% su ");
        out.printf("%.2f",prezzoMax);
        out.print(": EURO ");
        out.printf("%.2f",prezzoMax*(sconto/100));
        return prezzoScontato;
    }
    public void calcoloLire(){
        totaleLire = prezzoScontato * 1936.27f; // tasso conversione lire
        out.println("\nTOTALE SCONTATO: EURO ");
        out.printf("%.2f", prezzoScontato);
        out.print(" (");
        out.printf("%.2f",totaleLire);
        out.print(")");
    }
}

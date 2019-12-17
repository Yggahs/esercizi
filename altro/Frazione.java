public class Frazione {
   private int num, den;


   public Frazione (int x) {
     num=x;
     den=1;
   }

   public Frazione (int x, int y) {
      boolean negativo = x * y < 0;  //memorizza l'eventuale segno meno
      if (x < 0)
         x = - x;  //elimina l'eventuale segno meno davanti a x
      if (y < 0)
         y = - y;  //elimina l'eventuale segno meno davanti a y
      num = x;
      den = y;
      if (y != 0) {  //semplifica la frazione
         int m = mcd(x, y);
         if (negativo)
            num = - x / m;  //il segno meno viene memorizzato al numeratore
         else
            num = x / m;
         den = y / m;
      } else {   //impossibile, rappresentato con num e den a zero
         num = 0;
         den = 0;
      }
   }

   public Frazione somma(Frazione f) {
      int n = this.num * f.den + this.den * f.num;
      int d = this.den * f.den;
      return new Frazione(n, d);
   }

   public Frazione sottrai(Frazione f) {
      int n = this.num * f.den - this.den * f.num;
      int d = this.den * f.den;
      return new Frazione(n, d);
   }

   public Frazione moltiplica(Frazione f) {
      int n = this.num * f.num;
      int d = this.den * f.den;
      return new Frazione(n, d);
   }

   public Frazione dividi(Frazione f) {
      int n = this.num * f.den;
      int d = this.den * f.num;
      return new Frazione(n, d);
   }

   public Frazione inverti() {
      return new Frazione(this.den, this.num);
   }

   public boolean equals(Frazione f) {
      if (this.num == f.num && this.den == f.den)
         return true;
      else
         return false;
   }

   public boolean eMinore(Frazione f) {
      Frazione g = this.sottrai(f);
      if (g.num < 0)
         return true;
      else
         return false;
   }

   public boolean eMaggiore(Frazione f) {
      Frazione g = this.sottrai(f);
      if (g.num > 0)
         return true;
      else
         return false;
   }

   public int compareTo(Frazione f) {
   	  if (this.eMinore(f))
	  	return -1;
	  else if (this.eMaggiore(f))
	         return 1;
		   else return 0;
   }

   public String toString() {
      if (den == 0)
         return "impossibile";
      else if (den == 1)
         return String.valueOf(num);
      else
         return num + "/" + den;
   }

   public int numeratore() {
      return num;
   }

   public int denominatore() {
      return den;
   }

   private static int mcd(int a,int b) {
      int resto;
      do {
         resto = a % b;
         a = b;
         b = resto;
      } while (resto != 0);
      return a;
   }

}

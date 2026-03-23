package exercicioumpoo;

public class Desktop extends Computador {
    
    String gabinete;
   void ApresentarPC(){
       System.out.println("Este é um Desktop " +marca+ " com gabinete " +gabinete);
        System.out.println("Possui " +memoria+"GB de Memória e " +hd+"GB de HD.");
   }
}

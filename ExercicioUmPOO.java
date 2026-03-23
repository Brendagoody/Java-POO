
package exercicioumpoo;

public class ExercicioUmPOO {

    public static void main(String[] args) {
        
        Desktop Dt1 = new Desktop();
        Dt1.marca = "Lenovo";
        Dt1.memoria = 500;
        Dt1.hd = 320;
        Dt1.gabinete = "Médio";
        Dt1.ApresentarPC();
    
        Desktop Dt2 = new Desktop();
        Dt2.marca = "Samsung";
        Dt2.memoria = 300;
        Dt2.hd = 220;
        Dt2.gabinete = "Pequeno";
        Dt2.ApresentarPC();
        
        Notebook Nb1 = new Notebook();
        Nb1.marca = "Lenovo";
        Nb1.memoria = 500;
        Nb1.hd = 320;
        Nb1.bateria = 4.5;
        Nb1.ApresentarPC();
        
        Notebook Nb2 = new Notebook();
        Nb2.marca = "Samsung";
        Nb2.memoria = 300;
        Nb2.hd = 220;
        Nb2.bateria = 5.5;
        Nb2.ApresentarPC();
        
    }
}

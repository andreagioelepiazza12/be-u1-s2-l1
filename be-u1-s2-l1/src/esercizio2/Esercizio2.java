package esercizio2;

public class Esercizio2 {

    public void calcolaKm(double km, double carburante){
        double KmLitro = 0;
        try{
             KmLitro = km/carburante;
        }catch(ArithmeticException e){
            System.out.println("Non puoi aver usato 0 litri di carburante per percorrere " + km + " chilometri");
        }finally {
            if(KmLitro>0){
                System.out.println("km/litro : " + KmLitro);
            }
        }





    }
}

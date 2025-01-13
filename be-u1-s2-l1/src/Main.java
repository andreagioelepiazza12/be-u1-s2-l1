import esercizio1.Esercizio1;
import esercizio2.Esercizio2;
import esercizio3.ContoCorrente;
import esercizio3.ContoOnLine;
import esercizio3.Exception.BancaException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Esercizio1 e1 = new Esercizio1();
        Esercizio2 e2 = new Esercizio2();

        ContoCorrente c1 = new ContoCorrente("Andrea Piazza",3000);
        ContoOnLine co = new ContoOnLine("Gioele Piazza", 3000, 1000);

        try {
            c1.preleva(3002);
        }catch(BancaException e){
            System.out.println("Il conto è in rosso");
        }

        try {
            co.preleva(1050);
        }catch(BancaException e){
            System.out.println("Il prelievo non è disponibile");
        }



        //e1.istanziaArray();
        //e2.calcolaKm(13,0);



    }
}
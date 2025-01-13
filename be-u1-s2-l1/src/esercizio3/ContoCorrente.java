package esercizio3;

import esercizio3.Exception.BancaException;

public class ContoCorrente {

    private String titolare;
    private int movimenti;
    private final int maxMovimenti = 50;
    private double saldo;

    public ContoCorrente(){

    }

    public ContoCorrente(String titolare, double saldo){
        this.titolare = titolare;
        this.saldo = saldo;
        this.movimenti = 0;
    }

    public int getMaxMovimenti() {
        return maxMovimenti;
    }

    public int getMovimenti() {
        return movimenti;
    }

    public void setMovimenti(int movimenti) {
        this.movimenti = movimenti;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitolare() {
        return titolare;
    }

    public void setTitolare(String titolare) {
        this.titolare = titolare;
    }

    public void preleva(double x) throws BancaException {
        if(movimenti < maxMovimenti){

            saldo = saldo -x;
            if(saldo<0){
                throw new BancaException("Il conto è in rosso");
            }
            movimenti++;
        }
    }

    public double restituisciSaldo(){
        return saldo;
    }

}

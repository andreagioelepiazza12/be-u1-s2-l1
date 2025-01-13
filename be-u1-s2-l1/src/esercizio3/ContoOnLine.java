package esercizio3;

import esercizio3.Exception.BancaException;

public class ContoOnLine extends ContoCorrente{
    private double maxPrelievo;

    public ContoOnLine(String titolare, double saldo, double maxPrelievo){
        super(titolare, saldo);
        this.maxPrelievo = maxPrelievo;
    }

    public double getMaxPrelievo() {
        return maxPrelievo;
    }

    public void setMaxPrelievo(double maxPrelievo) {
        this.maxPrelievo = maxPrelievo;
    }

    public void stampaSaldo(){
        System.out.println("Titolare: " + getTitolare() + " - saldo: " + getSaldo() + " - Num movimenti: " + getMovimenti()
        + " - Mssimo movimenti: " + getMaxMovimenti() + " Massimo prelievo possibile: " + maxPrelievo);
    }

    public void preleva(double x) throws BancaException {
        if(x<=maxPrelievo){
            super.preleva(x);
        } else if (x>maxPrelievo) {
            throw new BancaException("Il prelievo non è disponibile");
        }
    }
}

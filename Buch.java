
/**
 * Beschreiben Sie hier die Klasse Buch.
 * 
 * @author Andreas Maier
 * @version 17.10.2017
 */
public class Buch {
    private String titel;
    private double preis;
    
    public Buch(){
        this.titel = "-kein Titel vorhanden-";
        this.preis = 0.0;
    }
    
    public Buch(String titel){
        this.titel = titel;
        this.preis = 0.0;
    }
    
    public Buch(double preis){
        this.titel = "-kein Titel vorhanden-";
        this.preis = preis;
    }
    
    public Buch(String titel, double preis){
        this.titel = titel;
        this.preis = preis;
    }
    
    public String getTitel(){
        return this.titel;
    }
    
    public double getPreis(){
        return this.preis;
    }
}


/**
 * Beschreiben Sie hier die Klasse Person.
 * 
 * @author Andreas Maier 
 * @version 16.10.2017
 */
public class Person {
    // Datenfelder
    private String name;
    private int alter;

    // Konstruktor: keinen Rückgabetype, Name wie Klasse
    // default oder parameterloser Konstruktor
    public Person() {
        this.name = "-kein Name festgelegt-";
        this.alter = 0;
    }

    public Person(String name) {
        this.name = name;
        this.alter = 0;
    }

    // Überladen: gleicher Name, aber andere Parameter (Typ)
    public Person(String name, int alter) {
        this.name = name; //Verdeckung: DF name durch Parameter name verdeckt
        this.alter = alter;
    }

    // Getter
    public int getAlter() {
        return this.alter;

    }

    public String getName() {
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    /**
     * 
     */
    public void setAlter(int alter){
        this.alter = alter;
    }
}

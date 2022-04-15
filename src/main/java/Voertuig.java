abstract class Voertuig implements Goed {

    String type;
    protected double nieuwprijs;
    protected int bouwjaar;
    double nwaarde;

    public Voertuig(String tp, double pr, int jr){
        type = tp;
        nieuwprijs = pr;
        bouwjaar = jr;
    }

    public abstract boolean equals(Object obj);

    public String toString(){
        return "Voertuig: " + type + " met bouwjaar " + bouwjaar + " heeft een waarde van: " + Utils.euroBedrag(nwaarde);
    }

}

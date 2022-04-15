import java.time.LocalDate;
import java.util.Objects;

public class Computer implements Goed{

    private String type;
    private String macAdres;
    private double aanschafPrijs;
    private int productieJaar;

    public Computer(String tp, String adr, double pr, int jr){
        type = tp;
        macAdres = adr;
        aanschafPrijs = pr;
        productieJaar = jr;
    }

    public double huidigeWaarde() {
        int huidigeDatum = LocalDate.now().getYear();
        double waarde = aanschafPrijs;
        for(int i = 0; i < huidigeDatum - productieJaar; i++){
            waarde = waarde * 0.6;
        }
        return waarde;
    }

    public boolean equals(Object obj){
        if (obj instanceof Computer) {
            Computer andere = (Computer) obj;
            return Objects.equals(type, andere.type) && Objects.equals(macAdres, andere.macAdres);
        } else {
            return false;
        }
    }

    public String toString(){
        return "Computer: " + type + " met productiejaar " + productieJaar + " heeft een waarde van: " + Utils.euroBedrag(huidigeWaarde());
    }
}

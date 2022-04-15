import java.time.LocalDate;
import java.util.Objects;

public class Auto extends Voertuig {

    private String kenteken;

    public Auto(String tp, double pr, int jr, String kt){
        super(tp, pr, jr);
        kenteken = kt;
    }

    public double huidigeWaarde() {
        int huidigeDatum = LocalDate.now().getYear();
        double waarde = nieuwprijs;
        for(int i = 0; i < huidigeDatum - bouwjaar; i++){
            waarde = waarde * 0.7;
        }
        nwaarde = waarde;
        return waarde;
    }

    public boolean equals(Object obj){
        if (obj instanceof Auto) {
            Auto andere = (Auto) obj;
            return Objects.equals(type, andere.type) && Objects.equals(kenteken, andere.kenteken);
        } else {
            return true;
        }
    }


}

import java.time.LocalDate;
import java.util.Objects;

public class Fiets extends Voertuig {
    private int framenummer;

    public Fiets(String tp, double pr, int jr, int fnr) {
        super(tp, pr, jr);
        framenummer = fnr;
    }

    public double huidigeWaarde() {
        int huidigeDatum = LocalDate.now().getYear();
        double waarde = nieuwprijs;
        for (int i = 0; i < huidigeDatum - bouwjaar; i++) {
            waarde = waarde * 0.9;
        }
        nwaarde = waarde;
        return waarde;

    }

    public boolean equals(Object obj) {
        if (obj instanceof Fiets) {
            Fiets andere = (Fiets) obj;
            return Objects.equals(type, andere.type) && Objects.equals(framenummer, andere.framenummer);
        } else {
            return false;
        }
    }
}

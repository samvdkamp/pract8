import java.util.ArrayList;

public class BedrijfsInventaris {

    private String bedrijfsnaam;
    private double budget;
    public ArrayList<Goed> Lijst = new ArrayList<Goed>();

    public BedrijfsInventaris(String nm, double bud){
        bedrijfsnaam = nm;
        budget = bud;
    }

    public void schafAan(Goed g) {
        if (Lijst.isEmpty() && budget > g.huidigeWaarde()) {
            budget -= g.huidigeWaarde();
            Lijst.add(g);
        } else {
            for (Goed a : Lijst) {
                if (a.equals(g)) {
                    return;
                }
            }
            if(budget > g.huidigeWaarde()){
                budget -= g.huidigeWaarde();
                Lijst.add(g);
            }
        }
    }

    public String toString(){
        String inventaris = "";
        for(Goed a : Lijst){
            inventaris += a.toString() + ", " ;
        }
        return "Inventaris: " + inventaris;
    }
}

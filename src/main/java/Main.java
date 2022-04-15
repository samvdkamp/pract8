import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BedrijfsInventaris bedrinv = new BedrijfsInventaris("HU", 100000);
        Computer pc1 = new Computer("HP", "00:0C:6E:D2:11:E6", 5000.00, 2020);
        Computer pc2 = new Computer("HP", "00:0C:6E:D2:11:E6", 5000.00, 2020);
        Computer pc3 = new Computer("Apple", "00:99:6E:A0:22:O9", 500.00, 2021);
        Fiets f1 = new Fiets("Giant", 400.00, 2016, 6);
        Fiets f2 = new Fiets("Giant", 400.00, 2016, 6);
        Fiets f3 = new Fiets("Stella", 300.00, 2018, 9);
        Auto a1 = new Auto("Mercedes", 20000.99, 2019, "abc123");
        Auto a2 = new Auto("Mercedes", 20000.99, 2019, "abc123");
        Auto a3 = new Auto("Citroën", 19000.99, 2017, "xyz123");
        
        bedrinv.schafAan(pc1);
        bedrinv.schafAan(pc2);
        bedrinv.schafAan(pc3);
        bedrinv.schafAan(f1);
        bedrinv.schafAan(f2);
        bedrinv.schafAan(f3);
        bedrinv.schafAan(a1);
        bedrinv.schafAan(a2);
        bedrinv.schafAan(a3);


        System.out.println(bedrinv.toString());
    }
}

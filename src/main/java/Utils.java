import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utils {

    public static String euroBedrag(double bedrag){
        DecimalFormat form = new DecimalFormat("##.##");
        return "€ " + form.format(bedrag);
    }

    public static String euroBedrag(double bedrag, int precisie){
        if (precisie < 0) throw new IllegalArgumentException();
        BigDecimal decimaal = new BigDecimal(Double.toString(bedrag));
        decimaal = decimaal.setScale(precisie, RoundingMode.HALF_UP);
        return "€ " + decimaal.doubleValue();
    }
}



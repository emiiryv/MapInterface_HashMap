import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,String> country = new HashMap<>();

        country.put("TR","Türkiye");
        country.put("TR","TürkiyeYeni");
        country.put("GR","Almanya");
        country.put("EN","Ingiltere");

        //country.remove("EN);

        System.out.println(country.get("TR"));
        System.out.println(country.size());

        country.replace("GR","AlmanyaYeni");

        //Iterator kullanılmaz,Collectionlara özeldir maplerde kullanılmaz

        for (String countryKey : country.keySet()){
            System.out.println(countryKey);
            //System.out.println(country.get(countryKey)); Value bastırır
        }

        for (String countryValue : country.values()){
            System.out.println(countryValue);
        }

    }
}
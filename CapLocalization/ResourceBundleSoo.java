import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleSoo {

    public static void main(String... args){

        Locale.setDefault(new Locale("en", "US"));
        Locale locale = new Locale("en", "CA");

        ResourceBundle rb = ResourceBundle.getBundle("Soo", locale);
        System.out.println(rb.getString("hello"));
        System.out.print(". ");
        System.out.println(rb.getString("name"));
        System.out.print(". ");
        System.out.println(rb.getString("open"));
        System.out.print(". ");
        System.out.println(rb.getString("visitors"));

        Path oldhardDrivePath = Paths.get("");

    }



}

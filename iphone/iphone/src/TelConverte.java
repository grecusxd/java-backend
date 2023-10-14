
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TelConverte {


    public static String converter(String numero) {
        
        Pattern padrao = Pattern.compile("(\\d{2})(\\d{5})(\\d{4})");

     
        Matcher matcher = padrao.matcher(numero);

  
        if (matcher.matches()) {
  
            return "(" + matcher.group(1) + ") " + matcher.group(2) + "-" + matcher.group(3);
        } else {

            return "Numero invalido";
        }
    }
}

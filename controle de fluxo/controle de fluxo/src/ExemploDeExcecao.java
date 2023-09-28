import java.text.NumberFormat;
import java.text.ParseException;

class ExemploDeExcecao{
    public static void main(String[] args) {
        Number valor;
        try{
        valor = NumberFormat.getInstance().parse("75");
        System.out.println(valor);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
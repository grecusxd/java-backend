import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
    try{
        Scanner scanner= new Scanner(System.in).useLocale(Locale.US);
         
        System.out.println("Digiter seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digitte sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        //imprimindo o resultado
        System.out.println("Olá me chamo "+ nome.toUpperCase() +" "+sobrenome.toUpperCase());
        System.out.println("Tenho "+idade+" anos.");
        System.out.println("E tenho "+ altura+" metros");
        scanner.close();
    }
    catch (InputMismatchException e){
        System.out.println("Os campos idade e altura percisam ser numéricos");
    }
}
}

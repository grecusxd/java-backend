import java.util.Scanner;
import java.util.Random;

public class Telefone {
    Random aleatorio=new Random();
    Scanner scanner=new Scanner(System.in);
public void telOpt(){
    int opt=aleatorio.nextInt(3);
    if (opt==1){
        System.out.println("Tem alguem ligando...");
        System.out.println("1. Atender | 2. Recusar");
        int opcao=scanner.nextInt();
        if(opcao==1){atender();}else if(opcao==2){recusar();}else{}
    }
    else{
        int opcao=aleatorio.nextInt(3);
        System.out.println("Digite um numero de telefone:");
        String numTel=scanner.nextLine();
        String converteTel=TelConverte.converter(numTel);

        if(numTel.length()==11){
            ligar();
            System.out.println(converteTel);
            if(opcao==0){
                System.out.println("Ele não atendeu: deixe seu recado");
            }else{
                System.out.println("Alô, quem fala");
            }
        }
        else{
            System.out.println("Numero invalido");
        }

    }
}
    private void atender(){
        System.out.println("Atendendo...");
    }
    private void recusar(){
        System.out.println("Ligação recusada.");
    }
    private void ligar(){
        System.out.print("Ligando... ");
    }
    
}

import java.util.Scanner;
public class Iphone {
    public static void main(String[] args) throws Exception {
        System.out.println("Bem vindo ao iphone \n Escolha um APP");
        escolhaApp();
    }
    public static void escolhaApp(){
        Scanner scanner=new Scanner(System.in);
        Navegador abrirnav=new Navegador();
        Telefone telefone=new Telefone();
        ReprodutorMusical ipod=new ReprodutorMusical();
        System.out.println("1. Ipod | 2. Telefone | 3. Safari");        
        String opt=scanner.nextLine();
        switch(opt){
            case "1":
                System.out.println("Abrindo Ipod");
                ipod.musicEsacolha();
                break;
            case "2":
                System.out.println("Abrindo Telefone");
                telefone.telOpt();
                break;
            case "3":
                System.out.println("Abrindo Safari");
                abrirnav.navEsacolha();
                break;
            default:
                System.out.println("Opção invalida");
                break;
    }
}
}

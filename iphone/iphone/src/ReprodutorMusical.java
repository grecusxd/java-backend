import java.util.Scanner;
public class ReprodutorMusical {

    Scanner scanner=new Scanner(System.in);
    int opcao;
    public void musicEsacolha(){
        System.out.println("Escolha a musica");
        System.out.println("1. musica 1");
        System.out.println("2. musica 2");
        opcao=scanner.nextInt();
        if(opcao==1){
            System.out.println("Musica 1 selecionada- o que desja fazer");
            System.out.println("1. tocar | 2. voltar");
            int opt=scanner.nextInt();
            if(opt==1){
                System.out.println("Reproduzindo");
            }else if(opt==2){
                musicEsacolha();
            }else{System.out.println("opção invalida");}

        }else if(opcao==2){
            System.out.println("Musica 2 selecionada- o que desja fazer");
            System.out.println("1. tocar | 2. voltar");
            int opt=scanner.nextInt();
            if(opt==1){
                System.out.println("Reproduzindo");
            }else if(opt==2){
                musicEsacolha();
            }else{System.out.println("opção invalida");}

        }


 
scanner.close();
}
}

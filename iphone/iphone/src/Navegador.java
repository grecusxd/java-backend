import java.util.Scanner;

public class Navegador {
    Scanner scanner=new Scanner(System.in);
    int opcao;
    public void navEsacolha(){
        System.out.println("Escolha uma opção");
        System.out.println("1. Abrir pagina.");
        System.out.println("2. Adicionar aba.");
        System.out.println("3. Sair");
        opcao=scanner.nextInt();

    if(opcao==1){
            System.out.println("Abrindo pagina.");
            abrirPagina();
            System.out.println("\nEscolha uma opção.");
            System.out.println("1. Recarregar\n2. Voltar para escolha\n3. Sair");
            int opt=scanner.nextInt();

            if(opt==1){ System.out.println("Recarregando");recarregarPagina();}
            else if(opt==2) {navEsacolha();}
            else if (opt==3){}
            else{System.out.println("Opção invalida:");}
    }else if(opcao==2){
            System.out.println("Adicionando aba.");
            adicionarAba();}
                
     else if(opcao==3){
            System.out.println("Saindo");
            return;}
     else{
            System.out.println("Ops. Escolha uma opção válida");
            navEsacolha();
    }
scanner.close();
}

//metodos para abrir recarregar e adicionar pagina
    private void abrirPagina(){
        System.out.println(" “A tecnologia é só uma ferramenta. No que se refere a motivar as crianças e conseguir que trabalhem juntas, um professor é um recurso mais importante”. — Bill Gates");
    }
    private void recarregarPagina(){
        System.out.println("Recarregando pagina!");
        abrirPagina();
    }
    private void adicionarAba(){
        navEsacolha();
    }
        

}
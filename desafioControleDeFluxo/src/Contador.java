import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanear= new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        int numero1 = scanear.nextInt();
        System.out.println("Digite o segundo valor: ");

        int numero2 = scanear.nextInt();
        try{
            contar(numero1, numero2);
        }catch(ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
        scanear.close();
    }

    static void contar(int par1, int par2) throws ParametrosInvalidosException {
        if(par1>par2)
        throw new ParametrosInvalidosException("O segundo valor deve ser maior que o primeiro.");
        
            int contagem = par2-par1;
        for(int i=0; i<=contagem; i++){
            System.out.println("Imprimindo o numero " + i);
        }

    }
}
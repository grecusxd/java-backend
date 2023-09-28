public class Usuario {
    public static void main(String[] args) throws Exception {
SmartTv smartTv = new SmartTv();
smartTv.ligar();

System.out.println("TV ligada? "+smartTv.ligada);
System.out.println("Canal Autal: " + smartTv.canal);
System.out.println("Volume Atual: "+ smartTv.volume);

smartTv.aumentarVolume();
System.out.println("volume: " + smartTv.volume);
smartTv.diminuirVolume();
System.out.println("volume: "+ smartTv.volume);
}
}

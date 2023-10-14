public class SistemaIbge {
    public static void main(String[] args) throws Exception {
        for(EstadosBrasileiros e :EstadosBrasileiros.values()){
            System.out.println(e.getSigla()+" - "+e.getNome());
        }
        EstadosBrasileiros sp=EstadosBrasileiros.MARANHAO;
        System.out.println(sp);
    }
}

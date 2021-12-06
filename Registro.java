public class Registro extends Infracao {
    private String placaDoVeiculo;
    private String dataOcorrencia;
    private double quilometragemLocal;
    private static int numeroNotificacao =0;

    public Registro(Motorista motorista, String placaDoVeiculo, String dataDaOcorrencia, double quilometragemLocal) {
        super(motorista);
        this.placaDoVeiculo = placaDoVeiculo;
        this.dataOcorrencia = dataDaOcorrencia;
        this.quilometragemLocal = quilometragemLocal;
        geraNumeroNotificacao();
    }
    
    
    public void geraNumeroNotificacao() {
        this.numeroNotificacao += 1;
    }
    public String getRegistro(){
        return "placa: " +placaDoVeiculo + 
        ", data: " + dataOcorrencia + 
        ", KM: " + quilometragemLocal;
    }
    public int getNumeroNotificacao() {
        return numeroNotificacao;
    }
    public Boolean possuiMulta() {
        if(Registro.valorDaMulta>0) {
            System.out.println("Possui multa");
        } else {
            System.out.println("Não possui multa");
        }
        return true;
    }
    
}
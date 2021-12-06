
public class Motorista extends Habilitacao {
    protected String nomeMotorista;
    protected String cpfMotorista;
    protected String mensagem;
    
    public Motorista(String nomeMotorista, String cpfMotorista, String categoria, String validadeHabilitacao) {
        super(categoria, validadeHabilitacao);
        this.nomeMotorista = nomeMotorista;
        this.cpfMotorista = cpfMotorista; 
    }
    
    public boolean possuiHabilitacao() {
       String msg = tipoHabilitacao();
       if(msg == "Não possui Habilitação") {
        return false;
       } else {
        return true;
       }
    }
    public String tipoHabilitacao(){
        this.categoriaHabilitacao = categoriaHabilitacao.toUpperCase();
        switch (categoriaHabilitacao) {
            case "":
                this.mensagem = "Não possui Habilitação";
                return this.mensagem;
            case "A":
                this.mensagem = "Possui habilitação tipo A";
                return this.mensagem;
            case "B":
                this.mensagem = "Possui habilitação tipo B";
                return this.mensagem;
            case "C":
                this.mensagem = "Possui habilitação tipo C";
                return this.mensagem;
            case "D":
                this.mensagem = "Possui habilitação tipo D";
                return this.mensagem;
            case "E":
                this.mensagem = "Possui habilitação tipo E";
                return this.mensagem;
        
            default:
                this.mensagem = categoriaHabilitacao+" Não é um tipo de Habilitação";
                return this.mensagem;
        }
    }
    public String getCpfMotorista() {
        return this.cpfMotorista;
    }

    public void imprimir(){
        System.out.println("Nome: " + nomeMotorista);
        System.out.println("Cpf: " + cpfMotorista);
        System.out.println("Nivel: " + categoriaHabilitacao);
        System.out.println("Validade: " + validadeHabilitacao);
    }
    // public void imprimir(){
    //     System.out.println("Nome: " + nomeMotorista);
    //     System.out.println("Cpf: " + cpfMotorista);
    //     System.out.println("Nivel: " + categoriaHabilitacao);
    //     System.out.println("Validade: " + validadeHabilitacao);
    // }

} 
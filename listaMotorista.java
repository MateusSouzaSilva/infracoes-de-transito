import java.util.ArrayList;
import java.util.List;

public class listaMotorista{
    protected Registro registro;
    public listaMotorista() {
        this.registro = registro;

    }
    List<Motorista> motoristas = new ArrayList<Motorista>();
    protected String nivelDaMulta;
    
                   
    public void imprimir(){
        for(int contador=0; contador < motoristas.size(); contador++) {
            System.out.println();
            System.out.println("Nome: " + motoristas.get(contador).nomeMotorista);
            System.out.println("CPF: " + motoristas.get(contador).cpfMotorista);
            System.out.println("Categoria: " + motoristas.get(contador).categoriaHabilitacao);
            System.out.println("Validade: " + motoristas.get(contador).validadeHabilitacao);
            registro.statusInfracao();
            System.out.println();


        }
    }

    public Boolean verificaCPF(String cpfMotorista) {
    Boolean result = false;
        for(int contador=0; contador < motoristas.size(); contador++){
            if(cpfMotorista.equals(motoristas.get(contador).cpfMotorista)) {
                System.out.println();
                System.out.println(cpfMotorista);
                result = true;
            }
        }
        return result;
    }

    public void setRegistro(Registro registro) {
        this.registro = registro;
    }

    public Registro getRegistro() {
        return this.registro;
    }
    
}
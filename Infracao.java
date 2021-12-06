import java.util.Scanner;

public class Infracao {

    protected String nivelDaMulta;
    protected int pontuacao;
    protected static double valorDaMulta;
    protected int valorDeMultiplicacao;
    protected Motorista motorista;
    Scanner scan = new Scanner(System.in);

    public Infracao(Motorista motorista) {
        this.motorista = motorista;
    }

    public void criarMulta(String nivelDaMulta) {
        this.nivelDaMulta = nivelDaMulta.toUpperCase();
      
        if (nivelDaMulta.equals("LEVE")) {
            pontuacao = 3;
            valorDaMulta = 88.38;
            System.out.println("O nível de infração foi " + nivelDaMulta + ", você recebeu "+pontuacao+" pontos na carteira"+
            " e uma multa no valor de: R$ "+ valorDaMulta);
        } else if (nivelDaMulta.equals("MEDIA")) {
            pontuacao = 4;
            valorDaMulta = 130.16;
            System.out.println("O nível de infração foi " + nivelDaMulta + ", você recebeu "+pontuacao+" pontos na carteira"+
            " e uma multa no valor de: R$ " + valorDaMulta);
        } else if (nivelDaMulta.equals("GRAVE")) {
            pontuacao = 5;
            valorDaMulta = 195.23;
            System.out.println("O nível de infração foi " + nivelDaMulta + ", você recebeu "+pontuacao+" pontos na carteira"+
            " e uma multa no valor de: R$ " + valorDaMulta);
        } else if(nivelDaMulta.equals("GRAVISSIMA")){
            pontuacao = 7;
            valorDaMulta = 293.47;
            fatorMultiplicador();
            System.out.println("O nível de infração foi " + nivelDaMulta + ", você recebeu "+pontuacao+" pontos na carteira"+
            " e uma multa no valor de: R$ " + valorDaMulta);
        } else {
            System.out.println(nivelDaMulta + ", não é um nível de infração");
        }
    }   
    
    public double fatorMultiplicador() {
        do {
            System.out.println("Digite um valor de 1 a 60");
            System.out.print("Defina o valor de multiplicação: ");
            valorDeMultiplicacao = scan.nextInt();
        } while (valorDeMultiplicacao < 1 || valorDeMultiplicacao > 60);
        valorDaMulta = valorDaMulta * valorDeMultiplicacao;
        return valorDaMulta;
    }

    public void statusInfracao() {
        System.out.println("Dados da infração;");
        System.out.println(" nivel: "+this.nivelDaMulta);
        System.out.println("Valor: "+this.valorDaMulta);
        System.out.println("pontos perdidos: "+this.pontuacao);
    }
}
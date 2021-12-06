import java.util.Scanner;

public class Menu {
    public void Menu() {

        listaMotorista lm = new listaMotorista();

        Scanner scan = new Scanner(System.in);
        String nome;
        String cpf;
        String categoria;
        String validade;
        String res;
        String placaVeiculo;
        String dataOcorrencia;
        int km;

        
         do {
            System.out.print("Digite o nome do motorista: ");
            nome = scan.nextLine();
            System.out.print("Digite o cpf: ");
            cpf = scan.nextLine();
            System.out.print("Digite a categoria da habilitacao: ");
            categoria = scan.nextLine();
            System.out.print("Digite a validade da habilitacao: ");
            validade = scan.nextLine();

            System.out.println();
            if (lm.verificaCPF(cpf)) {
                System.out.println("CPF JA CADASTRADO, DIGITE UM CPF VALIDO !!");
            } else {
                Motorista motoristaOne = new Motorista(nome, cpf, categoria, validade);
                System.out.print("Defina o nivel da infracao (LEVE, MEDIA, GRAVE, GRAVISSIMA): ");
                String nivelDaMulta = scan.nextLine();

                System.out.print("Digite a placa do veículo: ");
                placaVeiculo = scan.nextLine();
                System.out.print("Digite a data da Ocorrencia: ");
                dataOcorrencia = scan.nextLine();
                System.out.print("Digite em qual quilômetro foi a ocorrencia: ");
                km = scan.nextInt();
                
                
                Registro registro = new Registro(motoristaOne, placaVeiculo, dataOcorrencia, km);
                
                lm.setRegistro(registro);
                lm.motoristas.add(motoristaOne);
                lm.registro.criarMulta(nivelDaMulta.toUpperCase());
                lm.imprimir();
                System.out.println("Placa: " + placaVeiculo);
                System.out.println("data da Ocorrencia: " + dataOcorrencia);
                System.out.println("Quilômetro: " + km);
            }
            
            System.out.println("Para cadastrar outro motorista digite sim ");
            res = scan.nextLine();
         }  while (res.equals("sim"));
    
        lm.imprimir();

    }
}

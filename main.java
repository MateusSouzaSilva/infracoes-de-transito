import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        listaMotorista lm = new listaMotorista();

        Scanner scan = new Scanner(System.in);
        String nome;
        String cpf;
        String categoria;
        String validade;
        String res;
        int opcao ;

        System.out.println("Selecione uma opção: ");
        System.out.println("1- Cadrastar Multa");
        System.out.println("2- Consulta");
        System.out.println("3- Consultar estatistica");
        System.out.println("4- Voltar ao menu");
        opcao = scan.nextInt();
        if (opcao == 1) { 
            do {
                System.out.print("Digite o nome do motorista: ");
                nome = scan.nextLine();
                System.out.print("Digite o cpf: ");
                cpf = scan.nextLine();
                System.out.print("Digite a categoria da habilitação: ");
                categoria = scan.nextLine();
                System.out.print("Digite a validade da habilitação: ");
                validade = scan.nextLine();

                System.out.println();
                if (lm.verificaCPF(cpf)) {
                    System.out.println("CPF JA CADASTRADO, DIGITE UM CPF VALIDO !!");
                } else {
                    Motorista motoristaOne = new Motorista(nome, cpf, categoria, validade);
                    Registro registro = new Registro(motoristaOne, "12k", "12/11", 10);
                    lm.setRegistro(registro);
                    lm.motoristas.add(motoristaOne);
                    System.out.print("Defina o nivel da infração (LEVE, MEDIA, GRAVE, GRAVISSIMA): ");
                    String nivelDaMulta = scan.nextLine();
                    lm.registro.criarMulta(nivelDaMulta.toUpperCase());
                    lm.imprimir();
                    registro.possuiMulta();
                    
                }
                
                System.out.println("Para cadastrar outro motorista digite sim ");
                res = scan.nextLine();
            }  while (res.equals("sim"));
        } else if(opcao == 2){
            System.out.println("Não possui Habilitação, veículo apreendido!");
        }
    
        lm.imprimir();
        
}

}
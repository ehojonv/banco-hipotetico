import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome = "João Alves";
        String tipoConta = "Corrente";
        int escolha = 0;
        double saldo = 2500;
        String menu = """
                
                *************************
                Dados do cliente:
                
                Nome: %s
                Tipo De Conta: %s
                Saldo: R$ %,.2f
               
                *************************
                """;
        String operacoes = """
                
                Operações:
                
                1. Verificar Saldo
                2. Transferir
                3. Receber
                4. Sair
                
                Digite o número da operação desejada:
                """;
        System.out.printf(menu,nome,tipoConta,saldo);

        while (escolha != 4) {

            System.out.print(operacoes);
            escolha = input.nextInt();

            if (escolha == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            } else if (escolha == 2) {
                System.out.println("Escolha um valor para transferir:");
                double transf = input.nextDouble();
                if (transf > saldo || transf < 0) {
                    System.out.println("Operação inválida");
                } else if (transf <= saldo){
                    saldo -= transf;
                    System.out.println("Saldo atualizado!");
                }
            } else if (escolha == 3) {
                System.out.println("Escolha um valor para receber:");
                double receb = input.nextDouble();
                if (receb < 0) {
                    System.out.println("Operação inválida");
                } else {
                    saldo += receb;
                    System.out.println("Saldo atualizado!");
                }
            } else if (escolha != 4) {
                System.out.println("Operação inválida");
            }
        }
    }
}
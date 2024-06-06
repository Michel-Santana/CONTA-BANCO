import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.print("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.print("Digite o número da sua conta: ");
        String numeroConta = scanner.next();

        System.out.print("Digite o saldo inicial: ");
        String saldoInicial = scanner.next();

        scanner.close();  

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é  ")
                .concat(numeroAgencia)
                .concat(", conta ")
                .concat(numeroConta)
                .concat(", e seu saldo de R$")
                .concat(saldoInicial)
                .concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}
    

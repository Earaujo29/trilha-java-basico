package trilha.java.basico;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args){

        int numero = 1021;
        String agencia ="067-8";
        String nomeCliente = "Euller";
        double saldo = 237.38;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua Agência:");
        agencia = scanner.next();
        System.out.println("Por favor, digite o número da sua Conta:");
        numero = scanner.nextInt();
        System.out.println("Por favor, Digite o seu nome:");
        nomeCliente = scanner.next();
        System.out.println("Por favor, informe o Saldo para depósito:");
        saldo = scanner.nextDouble();
        

        System.out.println("Olá ".concat(nomeCliente)+",".concat("obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)+", conta " + numero + " e seu saldo de R$" + saldo +" já está disponível para saque.");
        
    }
}

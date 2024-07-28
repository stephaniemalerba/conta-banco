import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
   public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
   
    //exibir as mensagens para o nosso usuário
    System.out.println("Digite o seu nome");
    String  nome = scanner.next();

    System.out.println("Digite o numero da conta");
    int conta = scanner.nextInt();

    System.out.println("Digite o numero da agência");
    String agencia = scanner.next ();

    System.out.println("Saldo");
    double saldo = scanner.nextDouble();

    //obter pela scanner os valores digitados no terminal
    
    //exibir a menssagem da conta criada
    System.out.println("Olá " +nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");
   }
}
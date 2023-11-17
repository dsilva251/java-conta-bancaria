import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
    Scanner contaBanco = new Scanner(System.in); 

    System.out.println("Digite seu usuario: ");
       int numero = contaBanco.nextInt();

    System.out.println("Digite sua agencia: ");
       String agencia = contaBanco.next();

    System.out.println("Digite seu nome");
       String nomeCliente = contaBanco.next();

    System.out.println("Digite seu Sobrenome: ");
       String nomeClienteSob = contaBanco.next();

    System.out.println("Digite seu saldo: ");
       double saldo = contaBanco.nextDouble();

    System.out.println("Olá, "+ nomeCliente.concat(" " + nomeClienteSob) +" obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    
    }
}

package Exercicio4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ContaExecao {
        Scanner entrada=new Scanner(System.in);
        Conta1 minhaConta = new Conta1();
        boolean parada=false;
        while (!parada) {
            try {
                System.out.println("Escolha uma opção:\n1-Sacar\n2-Depositar\n3-Cheque especial\n4-Sair");
                String  resposta = entrada.next();
                int resposta1=Integer.parseInt(resposta);

                switch (resposta1) {
                    case 1:
                        minhaConta.sacar();
                        break;
                    case 2:
                        minhaConta.depositar();
                        break;
                    case 3:
                        minhaConta.setLimite();
                        break;
                    case 4:
                        System.out.println("Saindo....");
                        parada=true;
                        break;
                    default:
                        System.out.println("Opção inválida!");

                }
            } catch (NumberFormatException e) {
                System.out.println("Não aceitamos números com virgula(,),números com ponto(.)  e letras(a,A)");
            }
        }
    }
}

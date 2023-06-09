package Exercicio3;
import java.util.Scanner;

public class Conta {
    private  double saldo,valor;
    Scanner scanner=new Scanner(System.in);
    public Conta(){
        this.saldo=5000;
        this.valor=2500;
    }
    public double getSaldo() {
        return saldo;
    }
    public double getValor(){
        return valor;
    }

    public void setLimite() throws ContaExecao {
        try {
            System.out.println("Seu Cheque especial tem o limite de "+getValor());
            System.out.println("Quanto deseja usar do cheque especial:");
            String resposta=scanner.next();
            double resposta1=Double.parseDouble(resposta);
            if (resposta1<=valor) {
                valor-=resposta1;
                System.out.println("Limite atual do cheque especial: " +getValor());
            } else {
                throw new ContaExecao("Esse valor execede o limite disponivel");
            }
        }catch (ContaExecao e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException n){
            System.out.println("Não aceitamos números com virgula(,) nem letras(a,A)");
        }
    }
    public void depositar()throws ContaExecao {
        try {
            System.out.println("Seu saldo é de "+getSaldo());
            System.out.println("Quanto deseja depositar:");
            String resposta=scanner.next();
            double resposta1=Double.parseDouble(resposta);
            if (resposta1>0){
                saldo+=resposta1;
                System.out.println("Deposito realizado com sucesso!");
                System.out.println("Seu saldo atual depois do deposito é "+getSaldo());
            }
            else {
                throw new ContaExecao("Valor inválido para depósito.");
            }
        }catch (ContaExecao e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException n){
            System.out.println("Não aceitamos números com virgula(,) nem letras(a,A)");
        }

    }
    public void sacar() throws ContaExecao {
        try {
            System.out.println("Seu saldo é de "+getSaldo());
            System.out.println("Quanto deseja sacar:");
            String resposta=scanner.next();
            double resposta1=Double.parseDouble(resposta);
            if (resposta1 > 0) {
                if (resposta1>getSaldo()){
                    throw new ContaExecao("Valor do saque excede o saldo disponível.");
                }
                else  {
                    saldo -= resposta1;
                    System.out.println("Saque realizado com sucesso. Saldo atual: " +getSaldo());
                }
            } else {
                throw new ContaExecao("Valor inválido para saque.");
            }
        }catch (ContaExecao e){
            System.out.println(e.getMessage());
        }
        catch (NumberFormatException n){
            System.out.println("Não aceitamos números com virgula(,) nem letras(a,A)");
        }
    }
}


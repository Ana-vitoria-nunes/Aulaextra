package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("=====Eu sei dividir=====");
        boolean entrada = false;
        while (!entrada) {
            try {
                System.out.println();
                System.out.println("Informe o primeiro valor: ");
                String x = teclado.next();
                double num1 = Double.parseDouble(x);
                if (num1 < 1) {
                    throw new IllegalArgumentException("Não dividimos números menor que zero(0) nem números negativos(-1)");
                }
                System.out.println("Informe o segundo valor: ");
                String y = teclado.next();
                double num2 = Double.parseDouble(y);
                if (num2 < 1) {
                    throw new IllegalArgumentException("Não dividimos números menor que zero(0) nem números negativos(-1)");
                }
                double r = num1 / num2;
                System.out.println("O resultado da divisão é: " + r);
                entrada=true;

            } catch (NumberFormatException e) {
                System.out.println("Não aceitamos letras, númeos com traço(-)ou virgula(,) para divisão digite números inteiros ou número com ponto(2.5).");

            } catch (IllegalArgumentException f) {
                System.out.println(f.getMessage());
            }
        }
    }
}
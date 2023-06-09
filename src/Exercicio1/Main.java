package Exercicio1;
public class Main {
    public static void main(String[] args) {
        System.out.println("Inicio da main");
        metodo1();
        System.out.println("Fim da main");
    }
    static void metodo1(){
        System.out.println("Inicio do metodo 1");
        metodo2();
        System.out.println("Fim do metodo 1");
    }
    static void metodo2(){
        System.out.println("Inicio do metodo 2");
        try {
            int[] array = new int[10];
            for (int i = 0; i < 15; i++) {
                array[i] = i;
                System.out.println(i);
            }
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Ocorreu uma exceção: " + exception.getMessage());
        }
        System.out.println("Fim do metodo 2");
    }
}

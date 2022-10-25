import java.util.Scanner;
public class Exercise5 {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);

        System.out.println("Introduce 10 numeros");

        int numero [] = new int[10];

        numero [0] = datos.nextInt();
        numero [1] = datos.nextInt();
        numero [2] = datos.nextInt();
        numero [3] = datos.nextInt();
        numero [4] = datos.nextInt();
        numero [5] = datos.nextInt();
        numero [6] = datos.nextInt();
        numero [7] = datos.nextInt();
        numero [8] = datos.nextInt();
        numero [9] = datos.nextInt();

        System.out.println("Muestra los numeros");

        for (int i = 9; i>=9; i--){
            System.out.println(numero[i]);
        }
    }
}

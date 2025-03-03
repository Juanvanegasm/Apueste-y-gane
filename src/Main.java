//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        int max = 3;
        int min = 1;
        int num;
        int dinero;
        int opcion;
        boolean jugardenuevo = true ;


        System.out.println("APUESTA Y GANA");
        System.out.println("Ingrese el monto incial");
        num = teclado.nextInt();

        dinero = ale.nextInt((max - min +1)) +min;

            do {

                if (dinero == 1) {
                    num = (num *= 2);
                    System.out.println("Ganaste: " + num);
                    System.out.println("Deseas volver a jugar? 1. Si  2.No");

                    opcion = teclado.nextInt();
                    if(opcion == 1){
                        dinero = ale.nextInt((max - min +1)) +min;
                        continue;

                    }else {
                        break;
                    }


                } else if (dinero == 2) {
                    num = (num /= 2);
                    System.out.println(" Perdiste la mitad: " + num);
                    System.out.println("Deseas volver a jugar? 1. Si  2.No");
                    opcion = teclado.nextInt();
                    if(opcion == 1){
                        dinero = ale.nextInt((max - min +1)) +min;
                        continue;

                    }else {
                        break;
                    }

                } else if (dinero == 3) {
                    num = (num *= 0);
                    System.out.println("Perdiste todo");
                    break;
                }

            }while(jugardenuevo);




    }
}
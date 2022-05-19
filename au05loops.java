import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class au05loops {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*FOR
        for(int cont = 0 ; cont < 5 ; cont++) {
            System.out.println(cont + "Biscoito");
        }*/

        /*
        int cont = 0;
        while(cont != 7){
            System.out.print("Digite um numero: ");
            cont = scan.nextInt();
        }*/


        int cont = 0;
        do{
            System.out.println(cont + "Biscoito");
            cont++;
        }while(cont < 7);
        System.out.println("Fim do programa.");
    }   
}

package aula17calculadora;

import java.util.Scanner;

public class Calc {

    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);

        Numero n1=new Numero();
        Numero n2=new Numero();
        Numero res=new Numero();    
        String opc="S";

        while(opc.equals("s") || opc.equals("S")){//Uso o equals para conferir se um valor é igual ao outro

            System.out.printf("%nDigite o primeiro valor: ");
            n1.setValor(scan.nextInt());
            System.out.printf("%nDigite o segundo valor: ");
            n2.setValor(scan.nextInt());
            res.setValor(n1.getValor() + n2.getValor());

            System.out.printf("%nA soma de %d com %d e igual a %d.",n1.getValor(),n2.getValor(),res.getValor());  
            System.out.printf("%nDeseja somar outro valor?(S/N): ");
            opc=scan.next();
            System.out.printf("%n%n%n");
            
        }
        
    }
    
}
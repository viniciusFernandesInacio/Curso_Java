


import java.util.Scanner;

public class au4Scanner_input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, res = 0;

        System.out.println("Digite um número: ");
        n1 = scan.nextInt();
        System.out.println("Digite um número: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("A soma de %d com %d é igual a %d.",n1,n2,res);
    }
}

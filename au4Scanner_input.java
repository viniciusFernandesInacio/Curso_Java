


import java.util.Scanner;

public class au4Scanner_input {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n1 = 0, n2 = 0, res = 0;
        String nome = "";

        System.out.println("Digite o seu nome: ");
        nome = scan.nextLine();
        System.out.println("Digite um numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite um numero: ");
        n2 = scan.nextInt();
        res = n1 + n2;
        System.out.printf("%s a soma de %d com %d e igual a %d.",nome,n1,n2,res);
    }
}

import java.util.Scanner;

public class Au04Scanner_input {
    public static void main(String[] args) {
        
        try (Scanner scan = new Scanner(System.in)) {
            int n1 = 0, n2 = 0,n3 = 0,n4 = 0,media = 0;
            final int mediaFinal = 60; //final int --> indica que a variavel é uma constante.
            String nome = "",res = "";

            System.out.println("Digite o seu nome: ");
            nome = scan.nextLine();
            System.out.println("Digite a primeira nota: ");
            n1 = scan.nextInt();
            System.out.println("Digite a segunda nota: ");
            n2 = scan.nextInt();
            System.out.println("Digite a terceira nota: ");
            n3 = scan.nextInt();
            System.out.println("Digite a quarta nota: ");
            n4 = scan.nextInt();
            media = (n1 + n2 + n3 + n4) / 4;
            if(media >= mediaFinal)
            System.out.printf("Aluno(a) %s foi %s, com a nota de %d",nome,res,media);
        }
    }
}

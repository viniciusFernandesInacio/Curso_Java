package aula33jogo_da_velha;
import java.util.Scanner;


public class JogoDaVelha {
    public static void main(String[] args) {
        
        Campo[][] velha=new Campo[3][3];
        char simboloAtual='X';
        Boolean game=true;
        String vitoria="";
        Scanner scan=new Scanner(System.in);

        iniciarJogo(velha);

        while(game){
            desenhaJogo(velha);
            vitoria=verificaVitoria(velha); //Variavel vitoria recebe a funcao verifica vitoria
            if(vitoria.equals("")){
                System.out.printf("Jogador %s venceu%n",vitoria);
                break;
            }
            try{
                if(verificarJogada(velha,jogar(scan,simboloAtual),simboloAtual)){
                    if(simboloAtual=='X'){
                        simboloAtual='O';
                    }else{
                        simboloAtual='X';
                    }
                }
            }catch(Exception e){//Caso ocorra algum erro
                System.out.printf("[ERRO]");
            }
        }
        System.out.printf("Fim de jogo.");
    }    

    public static void desenhaJogo(Campo[][] velha){
        limparTela();
        System.out.printf("  0    1    2%n%n");
        System.out.printf("0  %c | %c | %c %n",velha[0][0].getSimbolo(),velha[0][1].getSimbolo(),velha[0][2].getSimbolo());
        System.out.println("  -----------");
        System.out.printf("1  %c | %c | %c %n",velha[1][0].getSimbolo(),velha[1][1].getSimbolo(),velha[1][2].getSimbolo());
        System.out.println("  -----------");
        System.out.printf("2  %c | %c | %c %n",velha[2][0].getSimbolo(),velha[2][1].getSimbolo(),velha[2][2].getSimbolo());
    }

    public static void limparTela(){
        for(int cont=0;cont<200;cont++){
            System.out.println("");
        }
    }

    public static int[] jogar(Scanner scan,char simboloAtual){
        int[] p=new int[2];
        System.out.printf("%s %c%n","Quem joga: ",simboloAtual);
        System.out.print("Informa a linha: ");
        p[0]=scan.nextInt();
        System.out.print("Informa a coluna: ");
        p[1]=scan.nextInt();
        return p;
    }

    public static Boolean verificarJogada(Campo[][] velha,int p[],char simboloAtual){
        if(velha[p[0]][p[1]].getSimbolo()==' '){//usamos "" para string e ''para char
            velha[p[0]][p[1]].setSimbolo(simboloAtual);
            return true;
        }else{
            return false;
        }
    }

    public static void iniciarJogo(Campo[][] velha){
        for(int l=0;l<3;l++){
            for(int c=0;c<3;c++){
                velha[l][c]=new Campo();
            }
        }
    }

    public static String verificaVitoria(Campo[][] velha){
        return" ";
    }

}

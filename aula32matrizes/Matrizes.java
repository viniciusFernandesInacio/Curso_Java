package aula32matrizes;
import java.security.SecureRandom;//Realizando import para poder trabalhar com numeros randonicos


public class Matrizes {
    public static void main(String[] args) {

        final int LINHA=3;//Criando constante
        final int COLUNA=5;//Criando constante
        int[][] numeros=new int[LINHA][COLUNA];//Criando uma matriz com tres linhas e cinco colunas
        
        geraDados(numeros, LINHA, COLUNA);
        imDados(numeros, LINHA, COLUNA);
        
    }

    public static void geraDados(int[][] mtz, int linhas, int colunas){
        for(int l=0;l<linhas;l++){//Percorrendo toda a matriz usandos dois lacos FOR aninhados
            for(int c=0;c<colunas;c++){
                mtz[l][c]=new SecureRandom().nextInt(9);//Adicionando numeros aleatorios a matriz
            }
        }    
    }

    public static void imDados(int[][] mtz, int linhas, int colunas){//Funcao para imprimir a matriz
        for(int l=0;l<linhas;l++){
                for(int c=0;c<colunas;c++){
                    System.out.printf("| %d |",mtz[l][c]);
                }
            System.out.println();
        }  
    }
}

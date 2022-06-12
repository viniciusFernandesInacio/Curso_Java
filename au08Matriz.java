import java.security.SecureRandom;
public class Au08Matriz {
    public static void main(String[] args) {
        
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];  //Criando um array usando duas constantes.
        //int[][] num={{1,3,6,3,2},{0,1,5,4,2},{1,7,3,3,8}};  //Adicionando valores a um vetor.

        for(int l=0;l<linhas;l++){ //Criando um laço for para percorrer a matriz.
            for(int c=0;c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(9); //Adicionando valores aleatórios a matriz
            }
        }

        /*for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){         \\Criando um laço FOR para percorrer a array e imprimir ela.
                System.out.printf("%d | ",numeros[l][c]);  
            }
            System.out.println(" ");
        }*/
        for(int[] n:numeros){
            for(int v:n){              //Laço FOR especifico para matriz ou array, imprime a array de forma mais pratica.
                System.out.printf("%d | ",v);  
            }
            System.out.println(" ");
        }

    }
}

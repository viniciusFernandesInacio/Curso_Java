import java.security.SecureRandom;
public class au08Matriz {
    public static void main(String[] args) {
        
        final int linhas=3;
        final int colunas=5;
        int[][] numeros=new int[linhas][colunas];
        //int[][] num={{1,3,6,3,2},{0,1,5,4,2},{1,7,3,3,8}};

        for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                numeros[l][c]=new SecureRandom().nextInt(9);
            }
        }

        /*for(int l=0;l<linhas;l++){
            for(int c=0;c<colunas;c++){
                System.out.printf("%d | ",numeros[l][c]);
            }
            System.out.println(" ");
        }*/
        for(int[] n:numeros){
            for(int v:n){
                System.out.printf("%d | ",v);  
            }
            System.out.println(" ");
        }

    }
}

package aula29funcao_parametros;

public class FuncaoParametros {
    public static void main(String[] args) {
        
        //int[] valores={10,5,2,3};
        int res=soma(10,5,2,3);

        System.out.printf("%d",res);

    }

    public static int soma(int... n){//... Indica que eu posso aceitar indeterminado numero de parametros
        int res=0;
        for(int v:n){
            res+=v;
        }
        return res;
    }

}

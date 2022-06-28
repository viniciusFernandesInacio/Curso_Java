public class Au09Metodos {
    public static void main(String[] args) {
        /*Para declarar um metodo eu devo dar o modificador de acesso,
        tipo de retorno, nome, conjunto de parametros deste metodo*/
        int r;

        for(int i=0;i<3;i++){
          canal();  
        } 

        msg("Imprime uma string usando um parametro previamente definido na declaraçao da funçao",3);//Colocando os dois parametros de entrada do metodo
    
        r=soma2(10,5);//Indicando onde sera o retorno do metodo 
        System.out.println("O valor da soma e = " + r);

        System.out.println(soma2(7, 14));//Executando o metodo diretamente do print sem precisar criar uma nova variavel como foi feito acima
        
        System.out.println(soma(10,20,30,30));//Este metodo ira somar os numeros independentemente de quantos parametro eu indique
    }


    public static void canal(){
        System.out.println("Este metodo ira imprimir uma String");
        //Metodos void nao possuem retorno
    }

    public static void msg(String s, int n){
        for(int c=0;c<n;c++){
            System.out.println(s);    
        }
        //Metodo que usa dois parametros o primeiro é uma string e o segundo é um inteiro que sera usado para fazer um laço FOR
    }

    public static int soma2(int n1, int n2){
        int res=n1+n2;
        return res;
        //Metodos com parametro de retorno int retornam um inteiro
    }

    public static int soma(int... numeros){
        int res=0;
        for(int n:numeros){//Laço FOR especial para arrays(percorre todos os elementos de uma array)
           res+=n; 
        }
        return(res);
        
        //int... n quer dizer que eu tenho uma lista de valores que esta sendo indicada ali
    }
}

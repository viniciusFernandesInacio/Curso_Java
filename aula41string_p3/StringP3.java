package aula41string_p3;

public class StringP3 {
    public static void main(String[] args) {
        
        String s1="Abacate maduro - Melao estragado";
        String s2=" - Melancia nova";
        System.out.println(s1);

        //concat une duas strings em uma so
        System.out.println(s1.concat(s2));

        //substring me permite pegar apenas parte de uma determinada string
        System.out.println(s1.substring(0,8));//Me retorna a string que estiver entre os indices 0 e 8

        //indexOf me retorna a posicao do caractere usado como parametro e pode ter varios argumentos
        System.out.println(s1.indexOf("c",1));//Me retorna a posicao do segundo c 

        //starWith e endWith  uso para saber se uma string comeca com determinada string ou caractere. (Me retorna um boolean)
        if(s1.startsWith("s")){
            System.out.println("Verdadeiro.");
        }else{
            System.out.println("Falso.");
        }
    }
}

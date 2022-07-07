package aula40strings_p2;

public class StringP2{
    public static void main(String[] args) {
        
        String s1=new String("Vinicius"); //Instanciando um objeto da classe String
        String s2="vinicius";
        String s3="Curso de java";
        String s4="Curso de java Melao";
        String s5="Abacate maduro";
        String s6="Vinicius";

        System.out.println(s2);
        System.out.println(s1);
        
        //regionMatches pode ser usado para compar partes especificas de duas strings
        if(s3.regionMatches(true,0, s4,0,5)){ //equalsIgnoreCase faz a comparacao de dois objetos ignorando se as letras sao maiusculas ou minusculas
            System.out.println("s3 igual s4");
        }else{
            System.out.println("s1 diferente de s6");
        }
        
        //compareTo compara duas strings e retorna um numero positivo quando a primeira for maior, um numero negativo quando a primeira for menor e zero quando as duas forem iguais
        System.out.println(s1.compareTo(s6));

        //equalsIgnoreCase
        if(s1.equalsIgnoreCase(s2)){ //equalsIgnoreCase faz a comparacao de dois objetos ignorando se as letras sao maiusculas ou minusculas
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente de s6");
        }
        
        //equals vs ==
        if(s1.equals(s6)){//== compara o tipo do objeto(o objeto instanciado e diferente do objeto nao instanciado) e .equals compara apenas o conteudo 
            System.out.println("s1 igual s6");
        }else{
            System.out.println("s1 diferente de s6");
        }


    }
}
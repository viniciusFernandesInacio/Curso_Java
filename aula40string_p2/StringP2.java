package aula40string_p2;

public class StringP2 {
    public static void main(String[] args) {
        
        String s1=new String("Vinicius");
        String s2="Vinicius";
        String s3="Curso de java";
        String s4="Melao";
        String s5="Abacate maduro";

        System.out.println(s2);

        //equals vs ==
        if(s1.equals(s2)){//== compara o tipo do objeto e .equals compara a string 
            System.out.println("s1 igual s2");
        }else{
            System.out.println("s1 diferente de s2");
        }
    }
}

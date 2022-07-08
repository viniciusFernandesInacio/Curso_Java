package aula42strings_p4;

public class StringP4 {
    public static void main(String[] args) {
        
        String s1="Melancia do povo ";
        String s2="selvagem da vagem";
        String s3=s1.concat(s2);
        String s4;
        System.out.println(s3);

        //split separa a string em um ponto definido e nos retorna o array de string dos pontos separados
        String[] s5=s3.split(" ");
        for(String s:s5){
            System.out.println(s);
        }

        //toCharArray transforma uma string em um array de caracteres
        char[] c=s3.toCharArray();
        System.out.println(c);

        //trim remove os espacos antes das strinsgs
        System.out.println(s3.trim());

        //toLowerCase - toUpperCase convertem as strings para caracteres maiusculos ou minusculos
        System.out.println(s3.toLowerCase());

        //replace subistitui um caractere ou string por outra
        s4=s3.replace('M','K' );
        System.out.println(s4);


    }
}

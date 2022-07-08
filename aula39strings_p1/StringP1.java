package aula39strings_p1;

public class StringP1 {
    public static void main(String[] args) {
        char[] texto_c={'c','u','r','s','o',' ','d','e',' ','j','a','v','a'};
        char[] texto_d=new char[10];
        String texto_s=new String("Melancia");//A classe String facilita nossa vida e nos fornece varios metodos
        int tam;
        char c;

        String s1=new String(texto_s);//Poddo usar uma variavel String como parametro
        String s2=new String("Vinicius");//Posso adicionar uma string diretamente
        String s3=new String(texto_c);//Posso usar um array de char como parametro
        String s4=new String(texto_c,0,5);//Posso usar um array de char como parametro e indicar quais caracteres eu quero

        //length, cahrAt e getChars
        
        tam=texto_s.length();//Usamos o .length para verificar o tamanho de uma string e adicionar esse numero a uma variavel do tipo inteiro
        System.out.printf("Tamanho do texto: %d%n",tam);

        c=texto_s.charAt(2);//O .charAt nos retorna o char que esta na posicao que indicamos no seu parametro
        System.out.println("charAt: "+c);

        texto_s.getChars(0, 5, texto_d, 0);//Usando o getChars eu consigo pegar um determinado numero de caracteres de um array de caracteres e passar para outro array
        System.out.println(texto_d);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
    }
}

package aula31passando_parametro_para_programa;

public class Soma31 {
    public static void main(String[] args) {//Podemos adicionar elementos ao array args[] atraves do terminal

        int soma=0;
        if(args.length <=0){
            System.out.printf("%s%n","Sem valores para somar");
        }

        for(String n:args){
            int v=Integer.valueOf(n);//Convertendo o caractere para inteiro
            soma+=v;
        }
        System.out.printf("Soma dos valores: %d%n",soma);
    }
}

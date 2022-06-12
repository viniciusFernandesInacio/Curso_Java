import java.util.Arrays;

public class au07ArrayPt2 {

    public static void main(String[] args){
        
        final int tam=10;  //Criando uma constante.
        int[] num={60,10,6,3,15,7,9,2,10,4};  //Criando um array.
        int[] numeros=new int[tam];
        int p=23;
        int pos;

        //Arrays.sort(num); //Metodo que ordena a array por ordem de tamanho.
        ///Arrays.fill(numeros,tam);  //Metodo que preenche um array usando objetos que são declarados como parâmetro.
        //System.arraycopy(num, 0, numeros, 0, tam);  //Metodo que copia um array pára o outro dando o ('Origem', 'inicio', 'destino', 'inicio do destino', 'quantos elementos vão ser copiados').
        //System.out.printf("Arrays sao iguais: %s",Arrays.equals(num, numeros) ? "Sim" : "Nao");  //Arrays.equals é um metodo que diz se uma array é igual a outra, ele retorna um valor booleano.
                                                                                 //? : é um IF ELSE feito de forma reduzida.

        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);  //Metodo que procura um elemento dentro de um array e retorna sua posição, porém, a array deve estar ordenada (usar metodo sort antes).
        System.out.printf("O elemento %d esta na array? %s",p,pos > 0 ? "Sim" : "Nao");
        
        /*for(int i=0;i<num.length;i++){  \\Faza impressão dos elementos de um array.
            System.out.printf("%d - ",num[i]);
        }*/
        /*for(int n:numeros){  //Laço FOR especial para arrays. Este laço imprime os elelmentos de uma array de forma mais fácil.
            System.out.printf("%d - ",n);
        }*/
    }
}

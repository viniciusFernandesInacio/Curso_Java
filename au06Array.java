import java.util.Scanner;
public class Au06Array {
    public static void main(String[] args) {

       final int tam=5;     //Criando uma constante para usar futuramente.
       char[] gabarito={'a','a','d','b','c'}; 
       char[] respostas=new char[tam]; 
       int nota=0;
       try (Scanner scan = new Scanner(System.in)) {
        for(int i=0;i<tam;i++){
            System.out.printf("Informe a %dº resposta: ",i);
            respostas[i]=scan.nextLine().charAt(0);
            }
    }

       /*respostas[0]='a';
       respostas[1]='b';
       respostas[2]='c';
       respostas[3]='b';
       respostas[4]='b';*/

       for(int i=0;i<tam;i++){
            if(respostas[i] == gabarito[i]){
                nota++;
            }
        }

        System.out.printf("Nota do aluno: %d",nota);

       /*  final int tam=5;  //Criando uma constante para indicar o tamanho do array(vetor) no futuro.

        int[] numeros={10,20,30,40,50}; //Criando um array em apenas uma linha.

        int[] num=new int[tam]; //Criando um array(vetor) e colocando valores enquanto especifica as posições.
        num[0]=10;              //Usando a plavra new para indicar a criação de um novo objeto.
        num[1]=5;
        num[2]=15;
        num[3]=0;
        num[4]=8;

        for(int i=0;i<num.length;i++){          //.length é uma propriedade que retorna o tamanho do array(vetor).
            System.out.printf("%d - ",num[i]);  //Imprimindo a array(vetor).
        }
       
        System.out.printf("\n%d",numeros[4]);*/
    }
}

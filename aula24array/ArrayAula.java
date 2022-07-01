package aula24array;

public class ArrayAula {
    public static void main(String[] args) {
        
        int[] num=new int[5];//Uso as chaves para dizer que e um array

        num[0]=1;//Tenho que dizer o indice da array para poder adicionar um valor ou obter um valor
        num[1]=2;
        num[2]=3;
        num[3]=4;
        num[4]=5;

        /*for(int i=0;i<num.length;i++){
            System.out.printf("---> %d <---%n",num[i]);
        }*/
        
        for(int n:num){//Laco for especial para array
            System.out.printf("---> %d <---%n",n);
        }

    }
}

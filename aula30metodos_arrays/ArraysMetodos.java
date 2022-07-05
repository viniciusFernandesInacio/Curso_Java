package aula30metodos_arrays;

import java.util.Arrays;

public class ArraysMetodos {
    public static void main(String[] args) {
        
        int[] num1={0,1,2,3,4,5,6,7,8,9};
        int[] num2={0,1,2,3,4,5,6,7,8,9};
        int[] num3={9,8,7,6,5,4,3,2,1,0};
        int[] num4={90,50,0,70,40,20,60,30,10,80};
        int[] num5=new int[10];

        //Arrays.sort(num); //Faz a ordenacao do array por ordem de tamanho

        //Arrays.fill(num2,10); //Preenche o array com os valores desejados

        //System.arraycopy(num, 0, num2, 0, num.length); //Faz a copia de um array atraves da passagem de parametros

        //System.out.printf("num1 igual a num2: %s%n",Arrays.equals(num1, num2)?"Igual":"Diferente");
        //System.out.printf("num1 igual a num3: %s%n",Arrays.equals(num1, num3)?"Igual":"Diferente");
        //System.out.printf("num1 igual a num4: %s%n",Arrays.equals(num1, num4)?"Igual":"Diferente");
        //Arrays.equals e usado para comparar duas arrays 
    
        
        int valor=5;
        Arrays.sort(num1);//Para usar o binarySearch o array deve estar ordenado
        int pos=Arrays.binarySearch(num1, valor);//Usamos o binarySearch para realizar uma busca em um array
        System.out.printf("%d esta no array? %s - posicao:%d%n",valor,pos>-1?"Sim":"Nao",pos);


        //for(int n:num){
        //    System.out.printf("%d - ",n);
        //}    
    }
}

import java.util.Arrays;

public class au07ArrayPt2 {

    public static void main(String[] args){
        
        final int tam=10;
        int[] num={60,10,6,3,15,7,9,2,10,4};
        int[] numeros=new int[tam];
        int p=23;
        int pos;

        //Arrays.sort(num);
        ///Arrays.fill(numeros,tam);
        //System.arraycopy(num, 0, numeros, 0, tam);
        //System.out.printf("Arrays sao iguais: %s",Arrays.equals(num, numeros) ? "Sim" : "Nao");

        Arrays.sort(num);
        pos=Arrays.binarySearch(num, p);
        System.out.printf("O elemento %d esta na array? %s",p,pos > 0 ? "Sim" : "Nao");
        
        /*for(int i=0;i<num.length;i++){
            System.out.printf("%d - ",num[i]);
        }*/
        for(int n:numeros){
            System.out.printf("%d - ",n);
        }
    }
}

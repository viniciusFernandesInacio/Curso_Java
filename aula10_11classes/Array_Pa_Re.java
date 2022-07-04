package aula10_11classes;

public class Array_Pa_Re {
    public static void main(String[] args) {
        
        int[] notas={10,85,62,45,60,98,100,50,30,75};
        int[] resultado={0,0};
        //int ap,rp;
        //ap=rp=0;

        conferindoNotas(notas,resultado);

        System.out.printf("Aprovados: %d%n",resultado[0]);
        System.out.printf("Reprovados: %d%n",resultado[1]);

    }

    public static void conferindoNotas(int[] nt, int[] r){
        for(int n:nt){
            if(n>60){
                r[0]++;
            }else{
                r[1]++;
            }
        }
        //System.out.printf("Aprovados: %d%n",a);
        //System.out.printf("Reprovados: %d%n",r);
    }
}

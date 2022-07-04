package aula27array2;

public class Array2 {
    public static void main(String[] args) {
       int [] numeros={10,5,15,67,8,9,11,46,32,45,69,87,41};

       parImpar(numeros);

    }

    public static void parImpar(int[] num){
        String res;
        for(int n:num){
            if(n%2==0){
                res="Par"; 
            }else{
                res="Impar";
            }
            System.out.printf("%d: %s%n",n,res);
        }
    }
}

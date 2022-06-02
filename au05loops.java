public class au05loops {
    public static void main(String[] args) {

        /*FOR
        for(int cont = 0 ; cont < 100 ; cont++) {
            System.out.println(cont + "Biscoito");
        }*/

        /*
        int cont = 0;
        while(cont < 100){
            System.out.print("Digite um numero: ");
            cont++
        }*/

        int cont = 0;
        do{
            System.out.println(cont + "Biscoito");
            cont++;
        }while(cont < 100);
        System.out.println("Fim do programa.");
    }   
}

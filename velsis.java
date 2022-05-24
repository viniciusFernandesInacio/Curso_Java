public class velsis {
    
    public static void main(String[] args) {
        //FOR
        /*for(int cont = 0 ; cont < 101 ; cont++) {
            if(cont % 2 == 0){
                System.out.println(cont + " - Par");
            }else{
               System.out.println(cont + " - Impar");  
            }
           
        }*/

        //WHILE
        /*int cont = 0;
        while(cont < 101){
             if(cont % 2 == 0){
                System.out.println(cont + " - Par");
            }else{
               System.out.println(cont + " - Impar");  
            }
            cont++;
        }*/

        //DO WHILE
        int cont = 0;
        do{
            if(cont % 2 == 0){
                System.out.println(cont + " - Par");
            }else{
               System.out.println(cont + " - Impar");  
            }
            cont++;
        }while(cont < 101);
        System.out.println("Fim do programa.");
    }   
}



public class Au03comandos_condicionais {
    public static void main(String[] args) {
        
        // == > < >= <= != ! (true/false)
        // &&(AND) ||(OR)
        //? : (Operação ternária)
        
        int nota = 65;
        int media = 60;
        int faltas = 10;
        int maxFaltas = 5;
        /*String res;
        res = (nota >= media ? "Aprovado" : "Reprovado");
        System.out.println("Resultado: " + res);*/ 

        if(nota > media && faltas <= maxFaltas){
            System.out.println("Aprovado!");
        }else if(nota >= 40){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
        System.out.println("Fim do programa.");
        

    }    

}

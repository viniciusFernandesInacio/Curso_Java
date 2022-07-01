package aula22_23switch_break_continue;

public class Switch {
    public static void main(String[] args) {

        int nota=0;
        String res="";

        switch(nota){//switch pode ser usado de forma semelhante ao if, porem, e bem mais versatil
            case 10: case 9: case 8: case 7://case e usado para definir os casos e oque fazer em cada caso
                res="Aprovado";
                break;//break e usado para parar o looping do codigo e passa para a proxima execuçao do comando
            case 6: case 5: case 4: 
                res="Recuperacao";     
                break;
            case 3: case 2: case 1: case 0:
                res="Reprovado";
                break;    
            default:
                res="Nota invalida";
                break;        
        }
        System.out.printf("Resultado: %s!!!%n",res);


    }
}

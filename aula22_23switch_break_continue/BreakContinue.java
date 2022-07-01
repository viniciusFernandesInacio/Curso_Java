package aula22_23switch_break_continue;

public class BreakContinue{
    public static void main(String[] args) {
    //break e continue funcionam com do while, while, for, switch
        int cont=100;
        for(int i=0;i<cont;i++){
            
            if(i>=10 && i <=60){
                continue;//continue e usado para pular blocos de comando
            }
            System.out.printf("%d - ",i);
        }
    }
}
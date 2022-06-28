package aula10_11classes;
public class Au10ClassesPt01 {
  public static void main(String[] args) {//main indica que este metodo e o metodo principal do nosso programa
    
    //Processo de instanciaçao de um novo jogador na classe jogador
    //new indica a criaçao de um novo jogador, ele que aloca a memoria dinamica(heap) necesaria para o objeto
    int num=0;

    Jogador j1 = new Jogador(num++);//num++ usa a variavel e incrementa depois
    Jogador j2 = new Jogador(num++);//++num incrementa a variavel e depois a usa
    Jogador j3 = new Jogador(num++);


    /*j1.num=10;//num e public entao eu posso alteralo desta classe
    j2.num=5;
    System.out.printf("%n%d",j1.num);//Eu tenho acesso a variavel num porque ela tem o modificador de acesso public
    System.out.printf("%n%d",j2.num);*/
  }                            
    
                              
}

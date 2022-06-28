package aula13metodos_atributos_static;
public class static_metodos_atributos {
  public static void main(String[] args) {//main indica que este metodo e o metodo principal do nosso programa
    
    //Processo de instanciaçao de um novo jogador na classe jogador
    //new indica a criaçao de um novo jogador, ele que aloca a memoria dinamica(heap) necesaria para o objeto
    int num=0;

    Jogador.pontos();//Fazendo a chamada de um metodo static criado anteriormente
    Jogador.pontos();
    Jogador.pontos();

    Jogador j1 = new Jogador(num++);//num++ usa a variavel e incrementa depois
    Jogador j2 = new Jogador(num++);//++num incrementa a variavel e depois a usa
    Jogador j3 = new Jogador(num++);

    Jogador.alerta=true;

    j1.info();
    j2.info();
    j3.info();
    
    //System.out.printf("%nA quantidade de vidas do jogador 1 e de %d",j1.getVidas());
  }                            
    
                              
}

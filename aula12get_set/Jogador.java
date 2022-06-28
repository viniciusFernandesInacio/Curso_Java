package aula12get_set;
/*-->private public dizem o escopo ou onde esta classe será visivel no nosso programa
-->public quer dizer que qualquer outra classe que usar esta ira ter acesso a todos os metodos contidos aqui 
-->classe é a representaçao de um objeto, são as regras que o objeto vai seguir quando for instanciado
-->metodos são as funcionalidades que este objeto vai ter
-->atributos sao as caracteristicas que este objeto vai ter
-->uma classe pode ter varios objetos, EX:classe Carros = fusca, celta, corola, etc...
-->metodo construtor e uma metodo gerado automaticamento quando um novo objeto for criado*/
public class Jogador {
    /*-->metodo construtor nao tem retorno e obrigatorimente ele deve ter o mesmo nome da classe */
    private final int maxVidas=7;
    public int num=0;
    private int vidas=0;//Por ser private eu so posso acessar a variavel desta classe
   
    public Jogador(int num){
        this.num=num;//this quer dizer que o num parametro é o mesmo num da variavel que foi declarada antes
        this.vidas=1;
        System.out.printf("%nJogador numero %d criado %n",num);
    }    

    /*-->Metodos GET sao para obter valores das variaveis de uma classe 
    -->Metodos SET sao para atribuir valores as variaveis de uma classe*/
    public int getVidas(){//Metodo get que retorna o numero de vidas
        return this.vidas;
    }
    /*public void setVidas(int vidas){
        if(vidas > maxVidas){
          this.vidas=maxVidas;  
        }else if(vidas < 0){
            this.vidas=0;
        }else{
            this.vidas=vidas;
        }  
    }*/
    public void addVidas(){
        if(this.vidas < maxVidas){
          this.vidas++;  
        }
    }
}

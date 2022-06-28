package aula11get_set;
/*-->private public dizem o escopo ou onde esta classe será visivel no nosso programa
-->public quer dizer que qualquer outra classe que usar esta ira ter acesso a todos os metodos contidos aqui 
-->classe é a representaçao de um objeto, são as regras que o objeto vai seguir quando for instanciado
-->metodos são as funcionalidades que este objeto vai ter
-->atributos sao as caracteristicas que este objeto vai ter
-->uma classe pode ter varios objetos, EX:classe Carros = fusca, celta, corola, etc...
-->metodo construtor e uma metodo gerado automaticamento quando um novo objeto for criado*/
public class Jogador {
    /*-->metodo construtor nao tem retorno e obrigatorimente ele deve ter o mesmo nome da classe */
    public int num=0;
    private int numero=0;//Por ser private eu so posso acessar a variavel desta classe
   
    public Jogador(int num){
        this.num=num;//this quer dizer que o num parametro é o mesmo num da variavel que foi declarada antes
        this.numero=7;
        System.out.printf("%nJogador numero %d criado %n",num);
        System.out.printf("O valor atual do numero é de %d.",numero);
    }    

}

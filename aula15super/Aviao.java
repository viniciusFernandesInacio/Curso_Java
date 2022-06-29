package aula15super;

public class Aviao extends Veiculo{
    private int categoria;

    public Aviao(String nome,int categoria){//Classe construtora Aviao que faz referencia a classe cosntrutora Carro
        super(nome,10);//Toda a vez que uso o super eu faço uma referencia a super classe
        this.categoria=categoria;
    }

    public void info(){
        super.info();//Faço referencia a um metodo que criei na super classe
        System.out.printf("Categoria: %s%n",this.categoria);
    }

}

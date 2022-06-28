package aula14herança;

public class CarroCombate extends Carro{//extends quer dizer que esta classe ira herdar todos os metodos da minha classe carro
    private final int MAX_ARMAMENTO=100;    
    private final int MIN_ARMAMENTO=0;
    private int qtdeArmamento;

    public CarroCombate(String nome,int blindagem){//Criando um construtor para CarroCombate usando o construtor da classe pai
        super(nome);//super() e usado para chamar o construtor da classe pai e passar os parametros para ele 
        setArmamento(true);
        setBlindagem(blindagem);
        this.qtdeArmamento=100;
    }

    public void setQtdeArmamento(int qtdeArmamento){
        this.qtdeArmamento+=qtdeArmamento;
        if(this.qtdeArmamento > MAX_ARMAMENTO){
            this.qtdeArmamento=MAX_ARMAMENTO;
        }
        if(this.qtdeArmamento < MIN_ARMAMENTO){
            this.qtdeArmamento=MIN_ARMAMENTO;
        }
    }
    public int getQtdeArmamento(){
        return this.qtdeArmamento;
    }
    public void atirar(){
        if(this.qtdeArmamento > MIN_ARMAMENTO){
            setQtdeArmamento(-1);
        }else{
            System.out.println("Sem armamento.");
        }
    }
    public void info(){
        super.info();
        System.out.printf("Quantidade de armamento: %d%n",this.qtdeArmamento);
    }
}

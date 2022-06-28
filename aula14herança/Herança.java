package aula14herança;

public class Herança {
    public static void main(String[] args) {
        
        Carro c1=new Carro("Golf");
        Carro c2=new Carro("Opala");
        CarroCombate c3=new CarroCombate("Fusca",100);
        CarroCombate c4=new CarroCombate("Brasilia",80);

        c3.atirar();
        c3.atirar();
        c3.atirar();
        c4.sofrerDano(50);
        c1.sofrerDano(5);

        c1.setLigado(true);
        c1.info();
        c2.info();
        c3.info();
        c4.info();

    }
}

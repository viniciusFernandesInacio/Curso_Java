package aula20_21exercicio;

public class InterfaceAula {
    
    public static void main(String[] args) {
        Sapo a1=new Sapo(10,10,10);
        Aranha a2=new Aranha(5,5,5,3);
        Formiga a3=new Formiga(1,1,1);
        Vegetal v1=new Vegetal(3);
        Vegetal v2=new Vegetal(5);
        Vegetal v3=new Vegetal(10);

        a2.info();
        a2.atacar(a3);
        System.out.println(a3.getVivo());
        a3.mover();
        a2.info();
        a1.comer(v1.getMassa());
        a1.comer(v3.getMassa());
        a1.comer(v2.getMassa());
    }

}

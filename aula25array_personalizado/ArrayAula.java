package aula25array_personalizado;

public class ArrayAula {
    public static void main(String[] args) {
        
        final int NUMCARROS=5;
        Carro[] carros=new Carro[NUMCARROS];
        String[] modelosCarros={"Chevy","Uno","Opala","C63","A4"};

        /*carros[0]=new Carro("Chevy");
        carros[1]=new Carro("Uno");
        carros[2]=new Carro("Opala");
        carros[3]=new Carro("C63");
        carros[4]=new Carro("A4");*/

        //Inicializa a array carros
        for(int i=0;i<NUMCARROS;i++){
            carros[i]=new Carro(modelosCarros[i]);
        }

        //Imprimir a array carros
        for(Carro c:carros){
            c.info();
        }

    }
}

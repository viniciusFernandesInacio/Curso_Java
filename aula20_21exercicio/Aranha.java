package aula20_21exercicio;

public class Aranha extends Animal{

    private int veneno;

    public Aranha(int vel, int massa, int forca, int veneno){
        super(vel, massa, forca);
        this.veneno=veneno;
    }
    @Override//Indica que eu vou sobrescrever um metodo que sera usado exclusivamente para a aranha
    public void atacar(Animal a){
        if(this.getVivo()){
            if(this.getForca() <= a.getForca()){
                this.setForca(this.getForca()+a.getMassa());
            }
            if((this.getForca() + this.veneno) > a.getForca()){
                this.setForca(this.getForca()+a.getMassa());
                a.setVivo(false);
            }else{
                this.setVivo(false);
            }
        }else{
            System.out.println("==============================");
            System.out.println(this.getClass().toGenericString() + " esta morto, nao pode atacar.");
            System.out.println("==============================");
        }
    }
}

package aula18_19interface_class_abstrata;

public interface SerVivo {//As classes que implementarem essa interface seram obrigadas a implementar esses metodos
    //Nao posso usar o modificador private e protected em uma interface
 
    public void mover();
    public void comer(int massa);
    public void info();

}
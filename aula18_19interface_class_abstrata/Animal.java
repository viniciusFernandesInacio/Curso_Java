package aula18_19interface_class_abstrata;

abstract class Animal implements SerVivo{
    /*Classes abstratas so servem para ser herdadas e nao instanciadas */
    public Animal(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){}

}
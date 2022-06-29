package aula16protected;

public class Veiculo {
    protected String nome;//protected permite o acceso dessa variavel fora dessa classe mas somente por classes do mesmo pacote ou que usem extends(herança)
    protected int tipo;

    public Veiculo(String nome,int tipo){//Classe construtora classe
        this.nome=nome;
        this.tipo=tipo;
    } 


    public void info(){
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Tipo: %d%n",this.tipo);
    }
}

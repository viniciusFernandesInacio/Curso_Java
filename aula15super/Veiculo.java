package aula15super;

public class Veiculo {
    private String nome;
    private int tipo;

    public Veiculo(String nome,int tipo){//Classe construtora classe
        this.nome=nome;
        this.tipo=tipo;
    }


    public void info(){
        System.out.printf("Nome: %s%n",this.nome);
        System.out.printf("Tipo: %d%n",this.tipo);
    }
}

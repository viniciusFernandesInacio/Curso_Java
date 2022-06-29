package aula17calculadora;

public class Numero {

    private int valor;

    public Numero(){//Classe construtora
        this.valor=0;
    }

    public void setValor(int valor){//Metodo para atribuir um valor
        this.valor=valor;
    }
    public int getValor(){//Metodo para obter um valor
        return this.valor;
    }
}

package aula50iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class AulaIterator {
    public static void main(String[] args) {
        
        ArrayList<String> carros=new ArrayList<>();//HashSet me da varios metodos para trabalhar com a colecao

        carros.add("City");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("Sonata");
        carros.add("Fusca");
        carros.add("Argo");
        carros.add("Ford Ka");
        System.out.println(carros);
        
        Iterator<String> it=carros.iterator();
        while(it.hasNext()){
            String c=it.next();
            if(c=="Argo"){
                it.remove();//removendo carro
            }     
        }
        //System.out.println(it.next());//next() imprime o proximo elemento da lista 
        System.out.println(carros);
    }
}

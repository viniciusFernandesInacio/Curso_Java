package aula49hash_set;

import java.util.HashSet;

public class Hash_Set {//HashSet tem elementos unicos, portanto, nao conseguimos adicionar elementos repetidos
    public static void main(String[] args) {
        
        HashSet<String> carros=new HashSet<>();//HashSet me da varios metodos para trabalhar com a colecao

        carros.add("City");
        carros.add("Polo");
        carros.add("Golf");
        carros.add("Sonata");
        carros.add("Fusca");
        carros.add("Argo");
        carros.add("Ford Ka");
        
        System.out.println(carros.add("Polo")?"Sim":"Nao");
        System.out.println(carros.add("Fiesta")?"Sim":"Nao");
        carros.remove("Ford Ka");
        System.out.println(carros);
        
    }
}

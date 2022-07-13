package aula48hash_map;

import java.util.HashMap;

public class Hash_Map{
    public static void main(String[] args) {
        
        HashMap<Integer,String> carros=new HashMap<Integer,String>();//Primeiro a chave e depois o valor

        carros.put(1,"Polo");//put()Adiciona elemento 
        carros.put(2,"Opala");
        carros.put(3,"Fusca");
        carros.put(4,"Brasilia");
        carros.put(5,"Golf");
        carros.put(5,"Fox");

        System.out.println(carros);
        
        carros.remove(5);//remove() remove o objeto da colecao

        //carros.clear();//clear()limpa toda a colecao

        //System.out.println(carros.get(1));
        /*for(int i=1;i<carros.size()+1;i++){
            System.out.println(carros.get(i));
        }*/
        for(String c:carros.values()){
            System.out.println(c);
        }
    }
}

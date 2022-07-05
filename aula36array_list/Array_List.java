package aula36array_list;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        
        ArrayList<Integer> numeros=new ArrayList<>();//ArrayList e uma classe que tem varios metodos pre prontos e e usada para se trabalhar com arrays
        ArrayList<String> carros=new ArrayList<>();//Criando um ArrayList 

        numeros.add(7);
        numeros.add(5);
        numeros.add(6);

        carros.add("fusca");
        carros.add("opala");
        carros.add("brasilia");
        //carros.add(1,"c10");

        //carros.trimToSize(); //Usado para excluir indices vazios dentro do array

        //carros.indexOf("opala"); //indexOf e usado para checar a posicao de um elemento
        //carros.clear(); //clear e usado para limpar toda a array
        //carros.remove("fusca"); //remove e usado para remover um elemento de um array

        System.out.println(carros.get(1));

        for(int i=0;i<carros.size();i++){//size e um metodo do ArrayList que e usado para verificar o tamanho de um array
            System.out.println(carros.get(i));
        }

        /*for(int e:numeros){
            System.out.println(e);
        }
        for(String c:carros){
            System.out.println(c);
        }*/

    }
}

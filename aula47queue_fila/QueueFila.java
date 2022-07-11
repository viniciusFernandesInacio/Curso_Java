package aula47queue_fila;
//Queue e do tipo first in first out (primeiro a entrar primeiro a sair)

import java.util.LinkedList;
import java.util.Queue;

public class QueueFila {
    public static void main(String[] args) {
        
            Queue<String> carros=new    LinkedList<>();

        carros.add("Fusca");
        carros.add("C63");
        carros.add("Civic");
        carros.add("Kombi");
        carros.add("Astra");

        
        System.out.println("Topo da pilha: " + carros.peek());//peek() nos retorna o elemento no topo da pilha
        System.out.println("Topo da pilha: " + carros.poll());//poll() e usado para mostrar e retirar o elemento do topo da fila 
        
        System.out.println(carros);
        System.out.println(carros.isEmpty()?"Pilha vazia.":"Pilha com elementos.");//isEmpty() retorna um boolean e nos diz se tem elementos na pilha
        
    }
}

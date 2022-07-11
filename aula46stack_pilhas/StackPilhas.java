package aula46stack_pilhas;

//Stack e do tipo first in last out (primeiro a entrar ultimo a sair)

import java.util.Stack;

public class StackPilhas{
    public static void main(String[] args) {
        
        Stack<String> carros=new Stack<>();

        carros.push("Fusca");//push adiciona elementos a pilha
        carros.push("C63");
        carros.push("Civic");
        carros.push("Kombi");
        carros.push("Astra");

        
        System.out.println("Topo da pilha: " + carros.peek());//peek() nos retorna oque esta no topo da pilha
        System.out.println(carros.pop());//pop() apaga o elemento do topo da fila
        System.out.println(carros);
        System.out.println(carros.empty()?"Pilha vazia.":"Pilha com elementos.");//empty retorna um boolean e me diz se tem elementos na pilha
        
    }
}
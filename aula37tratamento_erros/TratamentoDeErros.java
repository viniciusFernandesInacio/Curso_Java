package aula37tratamento_erros;

import java.util.ArrayList;

public class TratamentoDeErros {
    public static void main(String[] args) {
        
        ArrayList<String> carros=new ArrayList<>();

        carros.add("fusca");
        carros.add("polo");
        carros.add("argo");
        carros.add("uno");
        carros.add("opala");

        try{ //Usamos try em comandos que podem dar problema porque se eles nao rodarem nos recebemos uma execao atraves do catch
            System.out.println(carros.get(10));
        }catch(IndexOutOfBoundsException e){ //Colocamos os parametros para indicar o tipo de erro que queremos tratar
            System.out.println("[ERRO]: " + e.getMessage()); //getMessage e um metodo da classe Exception
        }catch(ClassCastException e){
            System.out.println("[ERRO NA CLASSE]");
        }finally{ //finally e o ultimo caso do try e sera executado no final do try havendo erro ou nao
            System.out.println("Procedimento finalizado");
        }
        
    }
}

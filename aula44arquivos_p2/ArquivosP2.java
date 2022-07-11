package aula44arquivos_p2;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

//Aprender a abrir e ler arquivos
public class ArquivosP2{
    public static void main(String[] args) throws IOException {//throws IOException e usado para conseguir ler o arquivo poir a abertura de um arquivo é considerada uma operacao critica
        
        Path arquivo = Paths.get("C:/Users/Usuario/OneDrive - Grupo Marista/Desktop/Meus Cursos/Curso_Java/BUM.txt");

        List<String> linhas = Files.readAllLines(arquivo);

        for(String linha:linhas){
            System.out.println(linha);
        }

        //Outra solucao para tratamento de excecao de arquivo
        /*try{
            List<String> linhas = Files.readAllLines(arquivo);
            for(String linha:linhas){
                System.out.println(linha); // ou podemos usar o forEach -> linhas.forEach(linha -> System.out.println(linha))
            }
        }catch(Exception e){
            System.out.println("[ERRO]");
        }*/
    }
}
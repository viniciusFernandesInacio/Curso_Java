package aula43arquivos_p1;

import java.io.File;
import java.nio.file.*;

public class ArquivosP1 {
    public static void main(String[] args) {
        
        Path diretorio = Paths.get("C:/Users/Usuario/OneDrive - Grupo Marista/Desktop/Meus Cursos/Curso_Java");

        if(Files.isDirectory(diretorio)){//isDirectory checa se o diretorio existe
            System.out.println("Diretorio existe");
        }else{
            System.out.println("Diretorio nao existe");
        }
        if(Files.exists(diretorio)){//exists checa se o arquivo existe
            System.out.println("Diretorio existe");
        }else{
            System.out.println("Diretorio nao existe");
        }
    }
}

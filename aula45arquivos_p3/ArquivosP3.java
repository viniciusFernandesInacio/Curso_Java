package aula45arquivos_p3;

import java.nio.file.*;

public class ArquivosP3 {
    public static void main(String[] args) {
        
        Path billy = Paths.get("C:/Users/Usuario/OneDrive - Grupo Marista/Desktop/imagens/billy.jpg");
        Path rg = Paths.get("C:/Users/Usuario/OneDrive - Grupo Marista/Desktop/imagens/rg.jpg");

        try{
            byte[] bytesbilly=Files.readAllBytes(billy);//Operacao para ler os bytes de uma imagem e armazenar em um array de bytes
            Files.write(rg, bytesbilly);//Operacao para passar os bytes de uma imagem para outra
        }catch(Exception e){
            System.out.println("[ERRO]");
        }

    }
}

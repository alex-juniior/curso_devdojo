package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCreated = fileDiretorio.mkdir();
        System.out.println("Pasta criada? " + isDiretorioCreated);
//        File fileArquivoDiretorio = new File("E:\\Aprendendo_Java_Dev_Dojo\\maratona-java\\folder\\arquivo.txt");
        File fileArquivoDiretorio = new File(fileDiretorio, "arquivo.txt");
        boolean isFileCreated = false;
        try {
            isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("arquivo.txt criado? " + isFileCreated);
        File fileRenamed = new File(fileDiretorio,"arquivo_renomeado.txt");
        boolean isRenamed = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("arquivo.txt renomado "+ isRenamed);

        File diretorioRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio folder renomeado? " +isDiretorioRenomeado);
    }
}

package Borodino;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Borodino {
    public static final String ORIGINAL_PATH="C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\javaio\\src\\Borodino\\CopyBorodino.txt";
    public static final String COPY_PATH="C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\javaio\\src\\Borodino\\Borodino.txt";
    public static void main(String[] args) throws IOException {
        try(BufferedReader fileInputStream = Files.newBufferedReader(Paths.get(ORIGINAL_PATH));
            BufferedWriter fileOutputStream = Files.newBufferedWriter(Paths.get(COPY_PATH))
        ){
            int b;
            while (( b = fileInputStream.read()) != -1){
                fileOutputStream.write(b);
            }
        }
    }
}

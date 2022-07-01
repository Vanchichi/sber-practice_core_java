package Names;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class listName {
    public static final String ORIGINAL_PATH = "C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\javaio\\src\\Names\\listNames.txt";
    public static final String COPY_PATH = "C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\javaio\\src\\Names\\CopylistNames.txt";

    public static void main(String[] args) throws IOException {
        try (BufferedReader fileInputStream = Files.newBufferedReader(Paths.get(ORIGINAL_PATH));
             BufferedWriter fileOutputStream = Files.newBufferedWriter(Paths.get(COPY_PATH))) {
            int t = 11;
            int[][] a = new int[t][t];
            int i= 0; int j = 0; int k = 0;
            int c;
            while ((c = fileInputStream.read()) != -1) {
                if ((c != 32) & (c != 44)) {
                    a[i][j] = c;
                    j++;
                    k = 0;
                } else {
                    k++;
                    if (k == 1) {
                        i++;
                    }
                    j = 0;
                }
            }
            int b, h;
            for (i = 0; i < t; i++) {
                for (j = 0; j < t; j++) {
                    k = 0;
                    if (a[i][1] == a[j][1]) {
                        while ((a[i][k] == a[j][k]) & (a[i][k] != 0) & (i != j)) {
                            k++;
                        }
                    }
                    if ((a[i][k] < a[j][k] & (i != j))) {
                        for (h = 0; h < t; h++) {
                            b = a[i][h];
                            a[i][h] = a[j][h];
                            a[j][h] = b;
                        }
                    }
                }
            }
            String S;
            for (i = 0; i < t; i++) {
                S = "";
                for (j = 0; j < t; j++) {
                    if (a[i][j] != 0)  {
                        S = S + (char) a[i][j];
                    }
                }
                fileOutputStream.write(S+"\n");
            }
        }
        catch(IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
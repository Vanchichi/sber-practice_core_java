package ru.sber.base.syntax;
import java.io.*;
public class Task8 {
    public static void main(String[] args)  throws IOException   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in) );
        System.out.println("Что это такое: синий, большой, с усами и полностью набит зайцами?");
        int count=1;
        while (count <= 3){
            System.out.println("Введите вариант ответа:");
            String ans = br.readLine();
            if (ans.equals("Троллейбус")){
                System.out.println("Правильно!");
                break;
            }
            if (ans.equals("Сдаюсь")){
                System.out.println("Правильный ответ: троллейбус.");
                break;
            }
            if ((!ans.equals("Троллейбус"))&(!ans.equals("Сдаюсь"))){
                if (count == 3){
                    System.out.println("Правильный ответ: троллейбус.");
                    break;
                }
                if (count < 3)
                    System.out.println("Подумай еще.");
                    count++;
                }
            }
        }
    }
}

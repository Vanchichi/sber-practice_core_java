package hero;

import java.io.*;
public class Game {
    public static String PATH="C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\javaio\\game\\src\\hero\\Hero.txt";
    public static void main(String[] args) throws IOException,ClassNotFoundException {
        try (FileOutputStream outputStream = new FileOutputStream(PATH);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
             FileInputStream fileInputStream = new FileInputStream(PATH);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            Hero hero = new Hero("Jack");

            objectOutputStream.writeObject(hero);

            hero = (Hero) objectInputStream.readObject();
        }
    }
}

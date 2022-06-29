package bank;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import exception.*;
public class BankOnline {
    public void send(String cardNumber, double money) throws BlockCardsException, NullArgException, NegativeSummaException, LimitMoneyException, IOException {
        if (cardNumber.replaceAll(" ", "").length() != 16) {
            throw new InvalidCardNumberException("Карта введена неверно");
        }
        try {
            File file = new File("C:\\Users\\dvan-\\IdeaProjects\\sber-practice_core_java\\Exception\\BlockCards.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            if (cardNumber == line) {
                throw new BlockCardsException("Перевод на заблокированную карту");
            }
            while (line != null) {
                line = reader.readLine();
                if (cardNumber == line) {
                    throw new BlockCardsException("Перевод на заблокированную карту");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            if (money < 0) {
                throw new NegativeSummaException("Введена отрицательная сумма");
            }
            if (money > 50000) {
                throw new LimitMoneyException("Превышен лимит карты");
            }
            if ((money == 0) || cardNumber.equals("")) {
                throw new NullArgException("Один из аргументов равен null");
            }
        System.out.println("Операция прошла успешно");
        }
    }
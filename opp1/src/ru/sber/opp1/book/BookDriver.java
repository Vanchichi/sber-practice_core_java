package ru.sber.opp1.book;

public class BookDriver {
    public static void main(String[] args) {
        Author author1 = new Author("Dajte tank","men","Dajte_tank@gmail.com");
        Author author2 = new Author("Elektroforez","men","Elektroforez@gmail.com");
        Book book1 = new Book("Spam",author1,"2018");
        Book book2 = new Book("Firework",author2,"2021");
        book1.toString();
        book1.SetName("Sports glasses");
        book1.SetYear("2018");
        book1.SetAuthorFio("Buerak");
        book1.SetAuthorEmail("Buerak@gmail.com");
        System.out.print(book1.GetName()+" ");
        System.out.print(book1.GetYear() +" ");
        System.out.print(book1.GetAuthorFio() +" ");
        System.out.print(book1.GetAuthorGender() +" ");
        System.out.println(book1.GetAuthorEmail());
        book1.toString();
        book2.toString();
    }
}

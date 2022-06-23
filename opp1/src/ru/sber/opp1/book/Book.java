package ru.sber.opp1.book;

public class Book {
    public String name;
    public Author author;
    public String year;
    public Book(String name,Author author,String year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void SetYear (String year){
        this.year=year;
    }
    public void  SetAuthorFio(String fio){
        this.author.fio=fio;
    }
    public void SetAuthorGender(String gender){
        this.author.gender=gender;
    }
    public void SetAuthorEmail(String email){
        this.author.email=email;
    }
    public String GetName(){
        return name;
    }
    public String GetYear(){
        return year;
    }
    public String GetAuthorFio(){
        return author.fio;
    }
    public String GetAuthorGender(){
        return author.gender;
    }
    public String GetAuthorEmail(){
        return author.email;
    }

    @Override
    public String toString() {
        System.out.println(String.format("Book title:%s year:%s information about the author fio:%s gender:%s email:%s",name,year,author.fio,author.gender,author.email));
        return String.format("Book title:%s year:%s information about the author fio:%s gender:%s email:%s",name,year,author.fio,author.gender,author.email);
    }
}

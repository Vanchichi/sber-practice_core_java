package ru.sber.opp1.pizza;

public class PizzaOrder {
    private String name;

    public enum sizeType {SMALL, MEDIUM, BIG}
    private sizeType size;
    private boolean sause;
    private String adres;
    private boolean zakaz_prinet=Boolean.FALSE;

    public PizzaOrder(String name,sizeType size, boolean sause, String adres) {
        this.name = name;
        this.size=size;
        this.sause = sause;
        this.adres = adres;
    }

    public void order() {

        if (zakaz_prinet== Boolean.TRUE){
            System.out.println("Заказ уже принят.");
        } else {
            zakaz_prinet=Boolean.TRUE;
            if(sause==Boolean.TRUE){
            System.out.println(String.format("Заказ принят. Наименование пиццы:%s размер:%s c соусом на адрес:%s",name,size,adres));
        }else{
            System.out.println(String.format("Заказ принят. Наименование пиццы:%s размер:%s без соусом на адрес:%s",name,size,adres));
            }
            }
    }
    public void cansel(){
        if(zakaz_prinet==Boolean.TRUE){
            System.out.println("Заказ отменен");
        }else {
            System.out.println("Заказ не был принят");
        }
    }
    public void setName(String name){
        this.name=name;
    }
    public void setSize(sizeType size){
        this.size=size;
    }
    public void setSause(boolean sause){
        this.sause=sause;
    }
    public void setAdres(String adres){
        this.adres=adres;
    }
    public String getName(){
        return name;
    }
    public sizeType getSize(){
        return size;
    }
    public Boolean getSause(){
        return sause;
    }
    public String getAdres(){
        return adres;
    }

    @Override
    public String toString() {
        return String.format("Заказ принят:%s Пицца:%s Размер:%s С соусом:%s По адресу:%s",zakaz_prinet,name,size,sause,adres);
    }
}

package ru.sber.opp1.phone;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public void receiveCall (String name){
        System.out.println("Звонит: "+name);
    }
    public String getNumber (){
        return number;
    }
    public Phone(String number,String model,double weight){
        this.number=number;
        this.model=model;
        this.weight=weight;
    }
    public Phone(String number,String model){
        this.number=number;
        this.model=model;
    }
    public Phone(){
        //Конструктор без параметров
    }
    public void sendMessage (String[] numbers) {
        String [] a = numbers;
        System.out.println("Сообщение отправлено номерам: ");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public String toString() {
        return (String.format("number %s model %s weight %s",number,model,weight));
    }
}

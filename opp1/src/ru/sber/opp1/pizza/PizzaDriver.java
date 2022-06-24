package ru.sber.opp1.pizza;

public class PizzaDriver {
    public static void main(String[] args) {
        PizzaOrder pizza1 = new PizzaOrder("Жюльен", PizzaOrder.sizeType.MEDIUM,Boolean.TRUE,"ул.Мира, д.11");
        pizza1.cansel();
        pizza1.order();
        pizza1.order();
        pizza1.setName("Ветчина и Грибы");
        pizza1.setSize(PizzaOrder.sizeType.BIG);
        pizza1.setSause(Boolean.FALSE);
        pizza1.setAdres("Ярославская 101");
        System.out.print(pizza1.getName()+" ");
        System.out.print(pizza1.getSize()+" ");
        System.out.print(pizza1.getSause()+" ");
        System.out.println(pizza1.getAdres());
        System.out.println(pizza1.toString());
        pizza1.cansel();
    }

}

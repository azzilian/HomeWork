package homework.homeWork5;

import sun.security.x509.OtherName;

public class Animal {
//    Создать два класса Animal (super,родительский,базовый) и класс Cat (наследник).
//    -Класс Animal должен иметь следуюющие приватные поля vegetarian (boolean ), eats (String ), noOfLegs (int). Должен иметь гетеры и сетеры для,
//    а также два конструктора: первый принимает все параметры полей, второй без параметров.


    private   boolean vegetarian;
    private String eats;
    private int noOFlegs;
    void displayInfo() {
       System.out.println(" Особенности животины Ест: " + getEats() + ", Количество ног: "+ getNoOFlegs() + ", Вегетарианец?: " + isVegetarian());
    }

    Animal(){
        this(false,"Жрёт всё что видит",0);

    }

    Animal(boolean vegetarian, String eats, int noOFlegs){
        this.vegetarian = vegetarian;
        this.eats =eats;
        this.noOFlegs = noOFlegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOFlegs() {
        return noOFlegs;
    }

    public void setNoOFlegs(int noOFlegs) {
        this.noOFlegs = noOFlegs;
    }
}
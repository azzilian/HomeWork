package homework.homeWork5;

public class HomeWork5 {
    public static void main(String[] args) {
//Животное с параметрами
        Animal dog= new Animal(true,"Plants",4);
        dog.displayInfo();
//Животное без  параметров
        Animal dog2= new Animal();
        dog2.displayInfo();
//Котейка c параметрами
        Animal tom = new Cat(false,"Meat",4,"Red");
        tom.displayInfo();
//Котейка без параметров
        Animal tommas = new Cat(true,"Yogurt",3);
        tommas.displayInfo();
    }
}

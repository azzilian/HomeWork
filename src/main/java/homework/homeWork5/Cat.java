package homework.homeWork5;
//-Класс Cat должен расширять (наследовать) класс Animal. должен иметь приватное поле color (String). Сетер и гетер для него. иметь два конструктора:
//   --первый принимает параметры все параметры для конструирования себя (color) и родительскогокласса
//-- второй принимает параметры для конструирования родительского, класса color-по умолчанию
public class Cat  extends Animal{

    private String color;
    public Cat (boolean vegetarian, String eats, int noOFlegs,String color){
        super(vegetarian,eats,noOFlegs);
        this.color =color;

    }
    public Cat(boolean vegetarian, String eats, int noOFlegs){
        super(vegetarian,eats,noOFlegs);
        this.color = "Black";
    }

    @Override
    void displayInfo() {
        System.out.print(" У нашей кошки Цвет шерсти: " + color +", ");
        super.displayInfo();

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

package homework.homeWork4;

public class Util {

    static void showMass (int... nums){

        System.out.println("Наш масив выглядит так: " );
        for (int i: nums){
        System.out.println(i);
    }}

    static void summ (int... nums){

        int  total=0;
        for (int i: nums){
            if (i > 5 && i<45) {
                total = total + i;

            }
        }
        System.out.println("Сумма чисел больше 5 и меньше 45 в массиве = " + total);

    }

    static void allPositive (int... nums){
        System.out.println("Чётные позитивные числа : ");
        for (int i: nums){
            if (i > 0 && (i%2==0)){
                System.out.println(i);
            }
        }
    }

}


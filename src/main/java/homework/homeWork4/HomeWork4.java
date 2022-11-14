package homework.homeWork4;

public class HomeWork4 {
    public static void main(String[] args) {
        int min =-50, max =50; //создаём рандомный массив
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.floor(Math.random()*(max-min+1)+min);
        }

        Util.showMass(arr); //проверяем
        Util.summ(arr);//сумма в массиве
        Util.allPositive(arr);// Чётные позитивные числа
    }


}

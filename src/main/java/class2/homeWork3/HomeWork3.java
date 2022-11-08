package class2.homeWork3;



public class HomeWork3 {
    public static void main(String[] args) {
        int[] twodix = new int[]{1,5,46,3,11,10,2,6,19,17,20,21,42,0,100,45,-10,-11,-5,1000}; //инициализируем массив
        int i=0, summ=0;
        while (i < twodix.length ){
            if (twodix[i] > 5 && twodix[i]<45) { //условия выбора 5 и 45 не учитываем
                summ = summ + twodix[i];

            }
            i++;
        }
        System.out.println("Сумма в массиве " + summ);

        for (i=0; i< twodix.length; i++){ //ввиду отсутствия времени решил запилить короткую версию вывода всех положительных чисел
            if (twodix[i] > 0 && (twodix[i]%2==0)){
                System.out.println(twodix[i]);
            }
        }


    }
}

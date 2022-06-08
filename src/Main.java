import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<>();
        for (int i = -15; i <15 ; i++) {
            list.add(i);
        }  //создаем коллекцию с числами от -15 до 14
        int[] mass = new int[20];
        for (int i = 0; i <20 ; i++) {
            mass[i]= (int) list.get((int) (Math.random()*30)); //обращаемся к коллекции с диапазоном чисел, и с помощью Random получаем случайный элемент коллекции
        } //создаем массив случайных чисел со значением от -15 до 14
        System.out.println("Массив - " + Arrays.toString(mass)); //выводим все элементы массива
        Arrays.sort(mass); //находим максимальное число
        int count =0; //счетчик чисел больших, чем максимальное
        for (int i = 0; i <20 ; i++) {
            if(Math.abs(mass[i])>mass[19]){
                count++; //проходимся по всему массиву,если значение элемента по модулю больше, чем максимальное - увеличиваем значение переменной-счетчика
            }
        }
        System.out.println("Количество элементов по модулю больших, чем максимальный - " + count); //выводим конечный результат





    }
}

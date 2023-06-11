package HomeWork_01;

import java.util.Scanner;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class Task_01{

//Деление на 0
public static int devide(int x, int y) {
    return x/y;
    }

//неправильный ввод (могут ввести строку)
public static int scan(int number){
    Scanner iScanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    number = iScanner.nextInt();
    iScanner.close();
    return number;
    }

//возврат неверной длинны массива
static int array(int[] arr){
    int minSize = 4;
    if(arr.length < minSize){
        return -1;
    }
    return arr.length;
}

}
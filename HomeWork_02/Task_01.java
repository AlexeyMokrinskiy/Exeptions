package HomeWork_02;

import java.util.Scanner;

public class Task_01 {
    /*
     * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных.
     */

    public static void main(String[] args) {
        // Я сделал 2 метода, первый через регулярные выражения - он лучше) но с 2я точнами падает(
        floatInput1(); 
        // Scanner iScanner = new Scanner(System.in);
        // floatInput2(iScanner);
    }

    public static void floatInput1(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите дробное число через точку (.): ");
        String line = iScanner.nextLine();
        Float index = null;
        if (line.matches("[0-9]+") || line.contains(".")){
            index = Float.parseFloat(line);
            System.out.println("Вы ввели дробное число: " + index);
            } else {
            System.out.println("Неверный ввод");
            floatInput1();
            }
        iScanner.close();
    }

    public static float floatInput2(Scanner scanner) {
        System.out.print("Введите дробное число через ,: ");
        while (!scanner.hasNextFloat()) {
            System.out.print("Ошибка ввода. Введите дробное число через ,: ");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}

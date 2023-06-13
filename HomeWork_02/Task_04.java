package HomeWork_02;

import java.util.Scanner;

public class Task_04 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя. 
    // Далее запросить повторный ввод строки

    public static void main(String[] args) {
        getNotNullString();
    }

    public static void getNotNullString(){
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Введите любой текст кроме пустой строки: ");
        String result = iScanner.nextLine();
        try {
            if(result.equals("")) throw new RuntimeException();        
            System.out.println("Вы ввели: " + result);
        } catch (Exception e) {
            System.out.println("Пустую строку вводить нельзя");
            getNotNullString();
        }
        iScanner.close();
    }
}

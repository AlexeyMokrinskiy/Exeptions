package HomeWork_02;

public class Task_02 {

    public static void main(String[] args) {
        
        try {
            int[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // Заполним массив
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
         } catch (ArithmeticException e) {
            System.out.println("На 0 делить нельзя: " + e);
         }
    }
}

package HomeWork_01;

public class Task_02 {
    // Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
    public static int sum2d(String[][] arr){
        int sum = 0; 
        for (int i = 0; i < arr.length; i++) { 
            for (int j = 0; j < 5; j++) { 
                int val = Integer.parseInt(arr[i][j]); 
                sum += val; 
            } 
        } 
        return sum; 
    }

    // 1. В метод можно передать одномерный массив
    // 2. Во втором цикле for (j < 5) - длинна массива может быть иной, луче ставить arr.length
    // 3. В 9ой строке есть вероятность ошибки преобразования
    // 4. Массивы могут быть не квадратными - нужно делать проверку
}

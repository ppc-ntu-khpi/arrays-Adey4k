package domain;

/**
 * Клас Exercise містить метод для перевірки, чи є число числом Армстронга.
 */
public class Exercise {  
    
    /**
     * Метод перевіряє, чи є передане число числом Армстронга.
     * 
     * Число Армстронга — це число, сума цифр якого,
     * піднесених до степеня, рівного кількості цифр у числі, дорівнює самому числу.
     * 
     * Метод розбирає число масив по одному числу, а потім в змінну sum
     * додає ці числа в степені рівній кількості чисел - якщо sum = оригинільному числу, воно є числом Армстронга
     **/
    public static boolean Calculate(int number) {
        String numStr = Integer.toString(number);
        int numLength = numStr.length();
        int[] digits = new int[numLength];
        
        for (int i = 0; i < numLength; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numLength);
        }
        
        return sum == number;
    }
}

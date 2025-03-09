# Практична робота "Масиви, вирази, керування виконанням програми"

## В рамках практичної роботи я зробив наступне:
1. модифікував стартовий код таким чином, щоб метод ```Calculate``` класу ```Exercise``` містив код обчислення значення у відповідності до завдання:<br>
Перевірте чи є задане число [числом Армстронга](https://uk.wikipedia.org/wiki/%D0%A7%D0%B8%D1%81%D0%BB%D0%B0_%D0%90%D1%80%D0%BC%D1%81%D1%82%D1%80%D0%BE%D0%BD%D0%B3%D0%B0)
3. рядок, який виводиться у результаті виконання методу ```main``` класу ```TestResult``` скоригував у відповідності до специфіки завдання
4. **Додав у README.MD опис виконаного завдання**
5. Подбав про:
    * **оптимізацію програми - обрати оптимальні з точки зору обсягу використовуваної пам'яті типи даних**
    * **іменування змінних і констант у відповідності до рекомендацій**
    * **javadoc-коментарі для класу ```Exercise```, які пояснюють що саме обчислюється і які вихідні дані для цього потрібні**
6. Здав завдання.

---

## Результати роботи:

![](https://github.com/ppc-ntu-khpi/arrays-Adey4k/blob/master/images/arrays.jpg "Вивід програми")

Вихідні коди:

[Exersice.java](https://github.com/ppc-ntu-khpi/arrays-Adey4k/blob/master/src/domain/Exercise.java)<br>
``` java
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

```
<br>

[TestResult.java](https://github.com/ppc-ntu-khpi/arrays-Adey4k/blob/master/src/domain/TestResult.java)<br>

``` java
package test;

import java.util.Scanner;
import static domain.Exercise.Calculate;


/**
 * Клас відповідає за взаємодію з користувачем
 */
public class TestResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean i = true;
        
        while (i == true) {
            System.out.print("Enter number, or 'q' to quit: ");
            
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (Calculate(number)) {
                    System.out.println(number + " is an Armstrongs number");
                } else {
                    System.out.println(number + " is NOT an Armstrongs number");
                }
            } else {
                String input = scanner.next();
                if (input.equalsIgnoreCase("q")) {
                    i = false;
                } else {
                    System.out.println("Unknown command");
                }
            }
        }
        
        scanner.close();
    }
}
```
<br>

##Фрагменти javadoc документації:

![](https://github.com/ppc-ntu-khpi/arrays-Adey4k/blob/master/images/arrays3.jpg "Excersice")

![](https://github.com/ppc-ntu-khpi/arrays-Adey4k/blob/master/images/arrays2.jpg "TestResult")

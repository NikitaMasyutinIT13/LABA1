import java.util.Scanner;

public class Laba1 {
  //1. МЕТОДЫ

  //Отбрасывание дробной части
  public double fraction(double x) {
    double fractional = x % 1;
    return Math.round(fractional * 10000000000.0) / 10000000000.0;
  }
  //Из символа в число
  public int charToNum(char x) {
    return x - '0';
  }
  //Двузначное число
  public boolean is2Digits(int x){
    return x>=10 && x<=99;
  }
  //Число в диапазоне
  public boolean isInRange(int a, int b, int num) {
    int min=a;
    int max=b;

    if (a<b){
      min=a;
      max=b;
    }
    if (b<=a){
      min=b;
      max=a;
    }
    return num >= min && num <= max;
  }

  //3 числа равны
  public boolean isEqual(int a, int b, int c) {
    return a == b && b == c;
  }

  //2. УСЛОВИЯ

  //модуль числа
  public int abs(int x) {
    return (x<0) ? -x : x;
  }
  //делится на 3 и на 5
  public boolean is35(int x) {
    boolean div3 = x % 3 == 0;
    boolean div5 = x % 5 == 0;
    return (div3 || div5) && !(div3 && div5);
  }
  //максимальное число из 3
  public int max3(int x, int y, int z) {
    int max = x;
    if (y > max) {
      max = y;
    }
    if (z > max) {
      max = z;
    }
    return max;
  }
  //сумма чисел
  public int sum2(int x, int y) {
    int sum = x + y;
    return (sum >= 10 && sum <= 19) ? 20 : sum;
  }
  //текущий день недели
  public String day(int x) {
    switch (x) {
      case 1: return "понедельник";
      case 2: return "вторник";
      case 3: return "среда";
      case 4: return "четверг";
      case 5: return "пятница";
      case 6: return "суббота";
      case 7: return "воскресенье";
      default: return "это не день недели";
    }
  }

  //ЦИКЛЫ

  //перечисление чисел
  public String listNums(int x) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= x; i++) {
      result.append(i);
      if (i < x) {
        result.append(" ");
      }
    }
    return result.toString();
  }
  //возвращает только четные числа
  public String chet(int x) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i <= x; i += 2) {
      result.append(i);
      if (i + 2 <= x) {
        result.append(" ");
      }
    }
    return result.toString();
  }
  //возвращает количество знаков в числе x
  public int numLen(long x) {
    if (x == 0) return 1;
    int count = 0;
    long temp = Math.abs(x);
    while (temp > 0) {
      temp /= 10;
      count++;
    }
    return count;
  }
  //выводит на экран квадрат из символов
  public void square(int x) {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
  //выводит на экран треугольник из символов
  public void rightTriangle(int x) {
    for (int i = 1; i <= x; i++) {
      // Пробелы перед звездочками
      for (int j = 0; j < x - i; j++) {
        System.out.print(" ");
      }
      // Звездочки
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

  //МАССИВЫ

  //поиск первого значения
  public int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        return i;
      }
    }
    return -1;
  }
  //поиск максимального
  public int maxAbs(int[] arr) {
    int maxAbsValue = Math.abs(arr[0]);
    int result = arr[0];

    for (int i = 1; i < arr.length; i++) {
      int currentAbs = abs(arr[i]);
      if (currentAbs > maxAbsValue) {
        maxAbsValue = currentAbs;
        result = arr[i];
      }
    }
    return result;
  }
  //добавление массива в массив
  public int[] add(int[] arr, int[] ins, int pos) {
    int[] result = new int[arr.length + ins.length];

    for (int i = 0; i < pos; i++) {
      result[i] = arr[i];
    }

    for (int i = 0; i < ins.length; i++) {
      result[pos + i] = ins[i];
    }

    for (int i = pos; i < arr.length; i++) {
      result[ins.length + i] = arr[i];
    }

    return result;
  }
  //возвратный реверс
  public int[] reverseBack(int[] arr) {
    int[] result = new int[arr.length];
    for (int i = 0; i < arr.length; i++) {
      result[i] = arr[arr.length - 1 - i];
    }
    return result;
  }
  //все вхождения
  public int[] findAll(int[] arr, int x) {
    int count = 0;

    for (int num : arr) {
      if (num == x) {
        count++;
      }
    }

    //массив результатов
    int[] result = new int[count];
    int index = 0;

    // массив с индексами
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == x) {
        result[index++] = i;
      }
    }

    return result;
  }


//вспомогательные методы для массивов
  public int[] readArrayManual(Scanner scanner, String message) {
    while (true) {
      System.out.print(message);
      String input = scanner.nextLine();

      boolean isValid = true;
      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (!(c == ' ' || c == '-' || c == '+' || (c >= '0' && c <= '9'))) {
          isValid = false;
          System.out.println("Ошибка! Обнаружены недопустимые символы");
          break;
        }
      }

      if (!isValid) {
        continue;
      }

      // количество чисел в строке
      int numberCount = 0;
      boolean inNumber = false;

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c != ' ') {
          if (!inNumber) {
            numberCount++;
            inNumber = true;
          }
        } else {
          inNumber = false;
        }
      }

      if (numberCount == 0) {
        System.out.println("Ошибка! Не введено ни одного числа.");
        continue;
      }

      // Создание и заполнение массива
      int[] arr = new int[numberCount];
      int index = 0;
      int start = -1;
      boolean hasError = false;

      for (int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        if (c != ' ') {
          if (start == -1) {
            start = i;
          }
        } else {
          if (start != -1) {
            String numStr = input.substring(start, i);
            try {
              arr[index] = Integer.parseInt(numStr);
              index++;
            }
            catch (NumberFormatException e) {
              System.out.println("Ошибка! '" + numStr + "' не является корректным числом.");
              hasError = true;
              break;
            }
            start = -1;
          }
        }
      }

      // Обработка последнего числа
      if (start != -1 && !hasError) {
        String numStr = input.substring(start);
        try {
          arr[index] = Integer.parseInt(numStr);
        }
        catch (NumberFormatException e) {
          System.out.println("Ошибка! '" + numStr + "' не является корректным числом.");
          hasError = true;
        }
      }

      if (hasError) {
        continue;
      }

      return arr;
    }
  }
//вывод массива
  public String formatArray(int[] arr) {
    if (arr == null) return "null";
    if (arr.length == 0) return "[]";

    StringBuilder sb = new StringBuilder();
    sb.append("[");
    for (int i = 0; i < arr.length; i++) {
      sb.append(arr[i]);
      if (i < arr.length - 1) {
        sb.append(", ");
      }
    }
    sb.append("]");
    return sb.toString();
  }

}

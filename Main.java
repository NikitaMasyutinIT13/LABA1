import java.util.Scanner;
public class Main {
  Laba1 test=new Laba1();
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Main main= new Main();
    boolean running = true;
    //ГЛАВНОЕ МЕНЮ
    while (running) {
      System.out.println("ГЛАВНОЕ МЕНЮ");
      System.out.println("1. Методы");
      System.out.println("2. Условия");
      System.out.println("3. Циклы");
      System.out.println("4. Массивы");
      System.out.println("5. Выход");
      System.out.print("Выберите категорию: ");

      int choice = 0;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      } else {
        System.out.println("Ошибка! Введите число от 1 до 5.");
        scanner.next();
        continue;
      }
      switch (choice) {
        case 1:
          main.methodsMenu(scanner);
          break;
        case 2:
          main.conditionsMenu(scanner);
          break;
        case 3:
          main.loopsMenu(scanner);
          break;
        case 4:
          main.arraysMenu(scanner);
          break;
        case 5:
          running = false;
          System.out.println("Программа завершена!");
          break;
        default:
          System.out.println("Неверный выбор. Выберите число от 1 до 5");
      }
    }
    scanner.close();
  }

  // Меню методов
  private void methodsMenu(Scanner scanner) {
    boolean backToMain = false;

    while (!backToMain) {
      System.out.println("МЕТОДЫ");
      System.out.println("1. Дробная часть");
      System.out.println("2. Букву в число");
      System.out.println("3. Двузначное");
      System.out.println("4. Диапазон");
      System.out.println("5. Равенство");
      System.out.println("6. Главное меню");

      System.out.print("Выберите задание: ");

      int choice = 0;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      }
      else {
        System.out.println("Ошибка! Введите число от 1 до 6.");
        scanner.next();
        continue;
      }
      switch (choice) {
        case 1:
          System.out.println("Вызов метода fraction()");
          fractionTask(scanner);
          break;
        case 2:
          System.out.println("Вызов метода charToNum()");
          charToNumTask(scanner);
          break;
        case 3:
          System.out.println("Вызов метода is2Digits()");
          is2DigitsTask(scanner);
          break;
        case 4:
          System.out.println("Вызов метода isinRange()");
          isInRangeTask(scanner);
          break;
        case 5:
          System.out.println("Вызов метода isEqual()");
          isEqualTask(scanner);
          break;

        case 6:
          System.out.println("Возврат в главное меню");
          backToMain = true;
          break;

        default:
          System.out.println("Неверный выбор. Введите число от 1 до 6");
      }
    }
  }
  //Задча с дробной частью
  private void fractionTask(Scanner scanner) {
    System.out.print("Введите число: ");

    while (!scanner.hasNextDouble()) {
      System.out.print("Ошибка! Введите число: ");
      scanner.next();
    }

    double number = scanner.nextDouble();
    scanner.nextLine();
    double result = test.fraction(number);
    System.out.println("Дробная часть: " + result);
  }
  // Задача "Букву в число"
  private void charToNumTask(Scanner scanner) {
    System.out.print("Введите цифру (0-9): ");

    String input = scanner.nextLine();

    if (input.length() != 1) {
      System.out.println("Ошибка! Введите ровно один символ.");
      return;
    }

    char x = input.charAt(0);

    if (x >= '0' && x <= '9') {
      int result =test.charToNum(x);
      System.out.println("Символ: '" + x + "'");
      System.out.println("Число: " + result);
    }
    else {
      System.out.println("Ошибка! Введите цифру от 0 до 9.");
    }
  }
  // Задача "Двузначное"
  private void is2DigitsTask(Scanner scanner) {
    System.out.print("Введите число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int number = scanner.nextInt();
    scanner.nextLine();

    boolean result = test.is2Digits(number);
    System.out.println("Число: " + number);
    System.out.println("Двузначное: " + result);
  }
  // Задача "Число в диапазоне"
  private void isInRangeTask(Scanner scanner) {
    System.out.print("Введите левую границу диапазона: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int a = scanner.nextInt();

    System.out.print("Введите правую границу диапазона: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int b = scanner.nextInt();

    System.out.print("Введите число для проверки: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int num = scanner.nextInt();
    scanner.nextLine();

    boolean result = test.isInRange(a, b, num);
    System.out.println("Диапазон: от " + Math.min(a, b) + " до " + Math.max(a, b));
    System.out.println("Число: " + num);
    System.out.println("Входит в диапазон: " + result);
  }

  // Задача "Равны ли три числа"
  private void isEqualTask(Scanner scanner) {
    System.out.print("Введите первое число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int a = scanner.nextInt();

    System.out.print("Введите второе число: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int b = scanner.nextInt();

    System.out.print("Введите третье число: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int c = scanner.nextInt();
    scanner.nextLine();

    boolean result = test.isEqual(a, b, c);
    System.out.println("Числа: " + a + ", " + b + ", " + c);
    System.out.println("Все числа равны: " + result);
  }

  // Меню условий
  private void conditionsMenu(Scanner scanner) {
    boolean backToMain = false;

    while (!backToMain) {
      System.out.println("УСЛОВИЯ");
      System.out.println("1. Модуль числа");
      System.out.println("2. Тридцать пять");
      System.out.println("3. Тройной максимум");
      System.out.println("4. Двойная сумма");
      System.out.println("5. День недели");
      System.out.println("6. Главное меню");
      System.out.print("Выберите задание: ");

      int choice = 0;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      }
      else {
        System.out.println("Ошибка! Введите число от 1 до 6.");
        scanner.next();
        continue;
      }
      switch (choice) {
        case 1:
          System.out.println("Вызов метода abs()");
          absTask(scanner);
          break;
        case 2:
          System.out.println("Вызов метода is35()");
          is35Task(scanner);
          break;
        case 3:
          System.out.println("Вызов метода max3()");
          max3Task(scanner);
          break;
        case 4:
          System.out.println("Вызов метода sum2()");
          sum2Task(scanner);
          break;
        case 5:
          System.out.println("Вызов метода day()");
          dayTask(scanner);
          break;
        case 6:
          backToMain = true;
          break;
        default:
          System.out.println("Неверный выбор. Введите число от 1 до 6.");
      }
    }
  }
  //ЗАДАЧИ ДЛЯ УСЛОВИЙ

  //модуль числа
  private void absTask(Scanner scanner) {
    System.out.print("Введите число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int number = scanner.nextInt();
    scanner.nextLine();
    int result = test.abs(number);
    System.out.println("Число: " + number);
    System.out.println("Модуль: " + result);
  }
  //тридцать пять
  private void is35Task(Scanner scanner) {
    System.out.print("Введите число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int number = scanner.nextInt();
    scanner.nextLine();
    boolean result = test.is35(number);
    System.out.println("Число: " + number);
    System.out.println("Делится на 3 или 5 (но не на оба): " + result);
  }
  //тройной максимум
  private void max3Task(Scanner scanner) {
    System.out.print("Введите первое число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int x = scanner.nextInt();

    System.out.print("Введите второе число: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int y = scanner.nextInt();

    System.out.print("Введите третье число: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int z = scanner.nextInt();
    scanner.nextLine();

    int result = test.max3(x, y, z);
    System.out.println("Числа: " + x + ", " + y + ", " + z);
    System.out.println("Максимальное: " + result);
  }
  //двойная сумма
  private void sum2Task(Scanner scanner) {
    System.out.print("Введите первое число: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int x = scanner.nextInt();

    System.out.print("Введите второе число: ");
    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }
    int y = scanner.nextInt();
    scanner.nextLine();

    int result = test.sum2(x, y);
    System.out.println("Числа: " + x + " + " + y + " = " + (x + y));
    System.out.println("Результат: " + result);
  }
  //день недели
  private void dayTask(Scanner scanner) {
    System.out.print("Введите номер дня недели (1-7): ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int dayNumber = scanner.nextInt();
    scanner.nextLine();
    String result = test.day(dayNumber);
    System.out.println("Номер дня: " + dayNumber);
    System.out.println("День недели: " + result);
  }

  // Меню циклов
  private void loopsMenu(Scanner scanner) {
    boolean backToMain = false;

    while (!backToMain) {
      System.out.println("ЦИКЛЫ");
      System.out.println("1. Числа подряд");
      System.out.println("2. Четные числа");
      System.out.println("3. Длина числа");
      System.out.println("4. Квадрат");
      System.out.println("5. Правый треугольник");
      System.out.println("6. Возврат в главное меню");
      System.out.print("Выберите задание: ");

      int choice = 0;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      }
      else {
        System.out.println("Ошибка! Введите число от 1 до 6.");
        scanner.next();
        continue;
      }
      switch (choice) {
        case 1:
          System.out.println("Вызов метода listNums()");
          listNumsTask(scanner);
          break;
        case 2:
          System.out.println("Вызов метода chet()");
          chetTask(scanner);
          break;
        case 3:
          System.out.println("Вызов метода numLen()");
          numLenTask(scanner);
          break;
        case 4:
          System.out.println("Вызов метода square()");
          squareTask(scanner);
          break;
        case 5:
          System.out.println("Вызов метода rightTriangle()");
          rightTriangleTask(scanner);
          break;
        case 6:
          backToMain = true;
          break;
        default:
          System.out.println("Неверный выбор.Введите число от 1 до 6.");
      }
    }
  }

  // Задачи для циклов

  //Числа подряд
  private void listNumsTask(Scanner scanner) {
    System.out.print("Введите число x: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int x = scanner.nextInt();
    scanner.nextLine();
    String result = test.listNums(x);
    System.out.println("Результат: " + result);
  }
  //Четные числа
  private void chetTask(Scanner scanner) {
    System.out.print("Введите число x: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int x = scanner.nextInt();
    scanner.nextLine();
    String result = test.chet(x);
    System.out.println("Результат: " + result);
  }
  //Длина числа
  private void numLenTask(Scanner scanner) {
    System.out.print("Введите число: ");

    while (!scanner.hasNextLong()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    long number = scanner.nextLong();
    scanner.nextLine();
    int result = test.numLen(number);
    System.out.println("Число: " + number);
    System.out.println("Количество знаков: " + result);
  }
  //Квадрат
  private void squareTask(Scanner scanner) {
    System.out.print("Введите размер квадрата: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int size = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Квадрат " + size + "x" + size + ":");
    test.square(size);
  }
  //Правый треугольник
  private void rightTriangleTask(Scanner scanner) {
    System.out.print("Введите высоту треугольника: ");

    while (!scanner.hasNextInt()) {
      System.out.print("Ошибка! Введите целое число: ");
      scanner.next();
    }

    int height = scanner.nextInt();
    scanner.nextLine();
    System.out.println("Правый треугольник высотой " + height + ":");
    test.rightTriangle(height);
  }
  // Меню массивов
  private void arraysMenu(Scanner scanner) {
    boolean backToMain = false;

    while (!backToMain) {
      System.out.println("МАССИВЫ");
      System.out.println("1. Поиск первого значения");
      System.out.println("2. Поиск максимального");
      System.out.println("3. Добавление массива в массив");
      System.out.println("4. Возвратный реверс");
      System.out.println("5. Все вхождения");
      System.out.println("6. Главное меню");
      System.out.print("Выберите задание: ");

      int choice = 0;
      if (scanner.hasNextInt()) {
        choice = scanner.nextInt();
        scanner.nextLine();
      } else {
        System.out.println("Ошибка! Введите число от 1 до 6.");
        scanner.next();
        continue;
      }
      switch (choice) {
        case 1:
          System.out.println("Вызов метода findFirst()");
          findFirstTask(scanner);
          break;
        case 2:
          System.out.println("Вызов метода maxAbs()");
          maxAbsTask(scanner);
          break;
        case 3:
          System.out.println("Вызов метода add()");
          addTask(scanner);
          break;
        case 4:
          System.out.println("Вызов метода reverseBack()");
          reverseBackTask(scanner);
          break;
        case 5:
          System.out.println("Вызов метода findAll()");
          findAllTask(scanner);
          break;
        case 6:
          backToMain = true;
          break;
        default:
          System.out.println("Неверный выбор. Введите число от 1 до 6 .");
      }
    }
  }
  //Поиск первого значения
  private void findFirstTask(Scanner scanner) {
    int[] arr = test.readArrayManual(scanner, "Введите массив чисел через пробел: ");
    System.out.print("Введите число для поиска: ");

    int x = scanner.nextInt();
    scanner.nextLine();

    int result = test.findFirst(arr, x);
    System.out.println("Массив: " + test.formatArray(arr));
    System.out.println("Индекс первого вхождения " + x + ": " + result);
  }
  //Поиск максимального
  private void maxAbsTask(Scanner scanner) {
    int[] arr = test.readArrayManual(scanner, "Введите массив чисел через пробел: ");
    int result = test.maxAbs(arr);
    System.out.println("Массив: " + test.formatArray(arr));
    System.out.println("Наибольшее по модулю значение: " + result);
  }
  //Добавление массива в массив
  private void addTask(Scanner scanner) {
    int[] arr = test.readArrayManual(scanner, "Введите основной массив: ");
    int[] ins = test.readArrayManual(scanner, "Введите массив для вставки: ");

    System.out.print("Введите позицию для вставки (0-" + arr.length + "): ");
    int pos = scanner.nextInt();
    scanner.nextLine();

    int[] result = test.add(arr, ins, pos);
    System.out.println("Исходный массив: " + test.formatArray(arr));
    System.out.println("Массив для вставки: " + test.formatArray(ins));
    System.out.println("Позиция вставки: " + pos);
    System.out.println("Результат: " + test.formatArray(result));
  }
  //Возвратный реверс
  public void reverseBackTask(Scanner scanner) {
    int[] arr = test.readArrayManual(scanner, "Введите массив чисел через пробел: ");
    int[] result = test.reverseBack(arr);
    System.out.println("Перевернутый массив: " + test.formatArray(result));
  }
  //Все вхождения
  private void findAllTask(Scanner scanner) {
    int[] arr = test.readArrayManual(scanner, "Введите массив чисел через пробел: ");
    System.out.print("Введите число для поиска: ");

    int x = scanner.nextInt();
    scanner.nextLine();

    int[] result = test.findAll(arr, x);
    System.out.println("Индексы вхождения " + x + ": " + test.formatArray(result));
  }
}


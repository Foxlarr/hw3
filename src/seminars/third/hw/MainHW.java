package seminars.third.hw;

public class MainHW {

    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод, который проверяет, является ли целое число записанное в переменную n, чётным (true) либо нечётным (false).



        public static boolean numberInInterval(int number) {

            return number > 25 && number < 100;
        }

    // HW 3.2. Нужно написать метод, который проверяет, попадает ли переданное число в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%

    public boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }


}


package practice.recursion;

public class EuclidGCD {
    // Наибольший общий делитель (НОД) двух чисел - это наибольшее число,
    // которое делит оба числа без остатка. НОД имеет несколько важных применений в математике
    // и информатике:
    // 1. Упрощение дробей: НОД числителя и знаменателя дроби позволяет сократить дробь
    //    до наименьших целых чисел. Например, для дроби 12/18 НОД(12, 18) равен 6,
    //    поэтому эту дробь можно упростить до 2/3, разделив числитель и знаменатель на 6.
    // 2. Решение уравнений и поиска делимости: НОД используется для решения уравнений и проверки делимости.
    //    Например, если НОД(15, 25) равен 5, это означает, что 5 является наибольшим числом,
    //    которое делит оба числа без остатка.
    // 3. Алгоритмы и криптография: НОД используется в различных алгоритмах,
    //    таких как RSA (алгоритм шифрования), где знание НОД двух чисел является важной
    //    частью процесса шифрования и дешифрования.
    // 4. Оптимизация алгоритмов: НОД используется в оптимизации алгоритмов, например,
    //    в алгоритме Евклида для нахождения НОД, который имеет множество применений
    //    в математике и компьютерных науках.
    // НОД является важным математическим понятием, которое находит свое применение
    // во многих областях, включая арифметику, алгоритмы, криптографию и другие области
    // науки и техники.
    public static void main(String[] args) {
        int m = 77;
        int n = 35;
        int res = greatCommonDivision(n, m);
        System.out.println("GCD= " + res);
    }
    private static int greatCommonDivision(int n, int m) {
        if (n <= 0 || m <= 0) {
            System.out.println("Euclid's algorithm only works with natural numbers!");
            return -1;
        } else {
            if (m == n) {
                return n;
            }
            if (n > m) {
                return greatCommonDivision(n - m, m);
            } else {
                return greatCommonDivision(n, m - n);
            }
        }
    }
}

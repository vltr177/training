/*
Реализуйте метод, вычисляющий факториал заданного натурального числа.

Факториал N вычисляется как 1 ⋅ 2 ⋅ ... ⋅ N
Поскольку это очень быстро растущая функция, то даже для небольших N вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.
*/

/**
 * Calculates factorial of given <code>value</code>.
 *
 * @param value positive number
 * @return factorial of <code>value</code>
 */
public static BigInteger factorial(int value) {
    BigInteger bigInteger = BigInteger.valueOf(value);
    if (value == 1 || value == 0) {
        return BigInteger.valueOf(value);
    }
    return bigInteger.multiply(factorial(value-1));
}

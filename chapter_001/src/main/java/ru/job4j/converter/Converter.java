package ru.job4j.converter;

/**
 * Корвертор валюты.
 */

public class Converter {
    /**
     * Конвертируем рубли в евро.
     * @param Rub рубли, Euro евро.
     * @return Евро.
     */
    public int rubleToEuro(int Rub, int Euro) {
       Rub = 70;
        Euro = Rub / 70;
        return Euro;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param Rub рубли, Dollar доллар.
     * @return Доллары
     */
    public int rubleToDollar(int Rub, int Dollar) {
        Rub = 60;
        Dollar = Rub / 60;
        return Dollar;
    }
    /**
     * Конвертируем рубли в евро.
     * @param Rub рубли, Euro евро.
     * @return Евро.
     */
    public int EuroToRuble(int Rub, int Euro) {
        Euro = 1;
        Rub = Euro * 70;
        return Rub;
    }

    /**
     * Конвертируем рубли в доллары.
     * @param Rub рубли, Dollar доллар.
     * @return Доллары
     */
    public int DollarToRuble(int Rub, int Dollar) {
        Dollar = 60;
        Rub = Dollar / 60;
        return Rub;
    }
}

package ru.job4j.stategy;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    @Test
    public void whenDrawSquare() {
        //Получаем ссылку на стандартный вывод в консоль.
        PrintStream stdout = System.out;
        //Создаем буфер для хранения вывода.
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        //Заменяем стандартный вывод на вывод в память для тестирования.
        System.setOut(new PrintStream(out));
        //Выаолняем действия пишушиее в консоль.
        new Paint().draw(new Square());
        //проверяем результат вычисления
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++")
                                .append("+  +")
                                .append("+  +")
                                .append("++++")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        //Возвращаем обратно тсандартный вывод на консоль.
        System.setOut(stdout);
    }

    @Test
    public void whenDrawTriangle() {
        PrintStream stdout = System.out;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        new Paint().draw(new Triangle());
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("  ^  ")
                                .append(" ^ ^ ")
                                .append("^   ^")
                                .append("^^^^^")
                                .append(System.lineSeparator())
                                .toString()
                )
        );
        System.setOut(stdout);
    }
}

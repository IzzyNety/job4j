package ru.job4j.tracker;

public class StubInput implements Input {
    /**
     * Это поле содержит последовательность ответов пользователя.
     */
    private final String[] value;

    /**
     * Поле считает количество вызовов метода ask.
     */
    private int position;

    public StubInput(final String[] value) {
        this.value = value;
    }

    /**
     * При каждом вызове метода ask увеличиваем счетчик и
     * при следующем вызове он вернет нам новое значение.
     */
    @Override
    public String ask(String question) {
        return this.value[this.position++];
    }

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Out of menu range.");
        }
        return key;
    }
}

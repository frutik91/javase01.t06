

/**
 * Класс, в котором хранится запись.
 */
class WritingInTheNotebook {
    /**
     * Строка, в которой хранится запись
     */
    private String entry;

    /**
     * Конструктор класса, добавляющий запись
     * @param newEntry Строка, которая будет записана в класс
     */
    WritingInTheNotebook(String newEntry) {
        entry = newEntry;
    }

    /**
     * Метод, изменяющий старую запись
     * @param newEntry Новая запись
     */
    void setEntry(String newEntry) {
        entry = newEntry;
    }

    /**
     * Метод возвращает запись
     * @return Запись
     */
    String getEntry() {
        return entry;
    }
}

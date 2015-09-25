import java.util.ArrayList;
import static java.lang.System.*;

/**
 * Класс блокнота.
 * Позволяет создавать блокнот, добавлять, редактировать и удалять записи.
 */
class NotebookClass {
    /**
     * Список записей
     */
    private ArrayList<WritingInTheNotebook> MyNotebook;

    /**
     * Конструктор класса Блокнот.
     */
    public NotebookClass() {
        MyNotebook = new ArrayList<WritingInTheNotebook>();
    }

    /**
     * Добавляет новую запись в блокнот.
     *
     * @param entry Текст записи.
     */
    public void addNewEntry(String entry) {
        MyNotebook.add(new WritingInTheNotebook(entry));
    }

    /**
     * Выводит в консоль все записи из блокнота в пронумерованном виде.
     */
    public void printAllEntry() {
        int i = 1;
        for (WritingInTheNotebook Entry : MyNotebook) {
            out.println("[" + i + "]" + Entry.getEntry());
            i++;
        }
    }

    /**
     * Изменяет уже существующую запись в блокноте.
     *
     * @param number Порядковый номер записи.
     * @param entry  Новый текст записи.
     */
    public void editEntry(int number, String entry) {
        number--;
        if (number < MyNotebook.size() && number >= 0) {
            WritingInTheNotebook edit = MyNotebook.get(number);
            edit.setEntry(entry);
            MyNotebook.set(number, edit);
        } else {
            out.println("In this notebook " + MyNotebook.size() + " records!");
        }
    }

    /**
     * Удаляет существующую запись из блокнота.
     *
     * @param number номер удаляемой записи.
     */
    public void deleteEntry(int number) {
        number--;
        if (number < MyNotebook.size() && number >= 0) {
            MyNotebook.remove(number);
        } else {
            out.println("There is no record ");
        }
    }
}

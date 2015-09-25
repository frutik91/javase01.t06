import java.util.ArrayList;
import static java.lang.System.*;

/**
 * ����� ��������.
 * ��������� ��������� �������, ���������, ������������� � ������� ������.
 */
class NotebookClass {
    /**
     * ������ �������
     */
    private ArrayList<WritingInTheNotebook> MyNotebook;

    /**
     * ����������� ������ �������.
     */
    public NotebookClass() {
        MyNotebook = new ArrayList<WritingInTheNotebook>();
    }

    /**
     * ��������� ����� ������ � �������.
     *
     * @param entry ����� ������.
     */
    public void addNewEntry(String entry) {
        MyNotebook.add(new WritingInTheNotebook(entry));
    }

    /**
     * ������� � ������� ��� ������ �� �������� � ��������������� ����.
     */
    public void printAllEntry() {
        int i = 1;
        for (WritingInTheNotebook Entry : MyNotebook) {
            out.println("[" + i + "]" + Entry.getEntry());
            i++;
        }
    }

    /**
     * �������� ��� ������������ ������ � ��������.
     *
     * @param number ���������� ����� ������.
     * @param entry  ����� ����� ������.
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
     * ������� ������������ ������ �� ��������.
     *
     * @param number ����� ��������� ������.
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

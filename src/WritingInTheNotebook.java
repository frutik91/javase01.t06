

/**
 * �����, � ������� �������� ������.
 */
class WritingInTheNotebook {
    /**
     * ������, � ������� �������� ������
     */
    private String entry;

    /**
     * ����������� ������, ����������� ������
     * @param newEntry ������, ������� ����� �������� � �����
     */
    WritingInTheNotebook(String newEntry) {
        entry = newEntry;
    }

    /**
     * �����, ���������� ������ ������
     * @param newEntry ����� ������
     */
    void setEntry(String newEntry) {
        entry = newEntry;
    }

    /**
     * ����� ���������� ������
     * @return ������
     */
    String getEntry() {
        return entry;
    }
}

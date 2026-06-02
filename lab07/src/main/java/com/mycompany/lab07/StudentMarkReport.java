public class StudentMarkReport {
    private String[] marks;

    // Constructor
    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    // Method to get mark at given index
    public int getMarkAt(int index) {
        String mark = marks[index];
        return Integer.parseInt(mark);
    }
}
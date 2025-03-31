public class Student {
    private String name;
    private double gpa;
    private int attendance;

    public Student(String name, double gpa, int attendance) {
        this.name = name;
        this.gpa = gpa;
        this.attendance = attendance;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }
    public int getAttendance() { return attendance; }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Amina", 2.3, 70));
        students.add(new Student("Ben", 3.1, 85));
        students.add(new Student("Chris", 2.0, 60));

        for (Student s : students) {
            boolean atRisk = s.getGpa() < 2.5 && s.getAttendance() < 75;
            String riskStatus = atRisk ? "At Risk" : "Not At Risk";
            System.out.println(s.getName() + ": " + riskStatus);
        }
    }
}

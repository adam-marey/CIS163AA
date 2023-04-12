public class TestPe10_9 {
    public static void main(String[] args) {
        Pe10_9 course = new Pe10_9("Introduction to Programming");

        course.addStudent("John");
        course.addStudent("Alice");
        course.addStudent("Bob");

        System.out.println("Course name: " + course.getCourseName());
        System.out.println("Number of students: " + course.getNumberOfStudents());

        String[] students = course.getStudents();
        System.out.println("Students enrolled in the course:");
        for (String student : students) {
            System.out.println(student);
        }

        course.dropStudent("Alice");
        System.out.println("After dropping a student:");
        System.out.println("Number of students: " + course.getNumberOfStudents());

        students = course.getStudents();
        System.out.println("Students enrolled in the course:");
        for (String student : students) {
            System.out.println(student);
        }

        course.clear();
        System.out.println("After clearing the course:");
        System.out.println("Number of students: " + course.getNumberOfStudents());
    }
}

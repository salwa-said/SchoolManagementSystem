package main;
import entities.Student;
import entities.SeniorStudent;
import services.StudentService;
import utils.InputHandler;

public class SchoolApp {
    private static StudentService studentService = new StudentService();
    private static InputHandler input = new InputHandler();

    public static void main(String[] args) {
        SchoolApp app = new SchoolApp();
        app.loadSampleData();
        app.run();
    }

    public static void run() {
        boolean exit = false;
        while (!exit) {
            printMenu();
            int choice = input.getIntInput("Choose:", 1, 4);
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewAllStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    exit = true;
                    break;
            }
        }
        System.out.println("Goodbye.");
    }

    private static void printMenu() {
        System.out.println("\n=== School Menu===");
        System.out.println("1.Add student");
        System.out.println("2. View all students");
        System.out.println("3. Search student by id");
        System.out.println("4. Exit");
    }

    private static void addStudent() {
        String first = input.getStringInput("First name:");
        String last = input.getStringInput("Last name:");
        int age = input.getIntInput("Age:");
        double fee = input.getDoubleInput("Fee:");
        String grade = input.getStringInput("Grade level:");

        Student s = new Student(studentService.getAllStudents().size() + 1, first, last, age, fee, grade);
        studentService.addStudent(s);
        System.out.println("Added: " + s.toString());
    }

    private static void viewAllStudent() {
        System.out.println("--- All students ---");
        for (Student s : studentService.getAllStudents()) {
            s.displayInfo();
        }
    }

    private static void searchStudent() {
        int id = input.getIntInput("Enter id:");
        for (Student s : studentService.getAllStudents()) {
            if (s.getId().equals(id)) {
                s.displayInfo();
                return;
            }
        }
        System.out.println("No student with that id.");
    }


    private void loadSampleData() {
        studentService.addStudent(1, "Ali", "Said");
        studentService.addStudent(2, "Layla", "Balushi");
        SeniorStudent senior = new SeniorStudent(3, "Maryam", "Said", 21, 100.0, "Grade 12", "Science");
        studentService.addStudent(senior);
    }
}




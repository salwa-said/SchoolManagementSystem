package services;

import entities.Student;
import interfaces.Manageable;
import interfaces.Searchable;
import utils.HelperUtils;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements Manageable<Student>, Searchable<Student> {
    private List<Student> students = new ArrayList<>();

    //Overloading
    public void addStudent(Student s) {
        students.add(s);
    }
    public void addStudent(String firstName, String lastName, String phone) {
        String id = HelperUtils.generateId("STU");
        Student s = new Student(Integer.valueOf(id.replace("STU-", "")), firstName, lastName, 0, 0.0, "Unknown");
        students.add(s);
    }

    public void addStudent(int id, String firstName, String lastName) {
        Student s = new Student(id, firstName, lastName, 0, 0.0, "");
        students.add(s);
    }

    public void addStudent(String name) {
        Student s = new Student(students.size() + 1, name, "", 0, 0, "");
        students.add(s);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    @Override
    public void add(Student entity) {
        students.add(entity);
    }

    @Override
    public boolean remove(String id) {
        Student found = searchById(Integer.valueOf(id));
        if (found != null) {
            students.remove(found);
            return true;
        }
        return false;
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public Student searchById(Integer id) {
        for (Student s : students) {
            if (s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    @Override
    public List<Student> search(String keyword) {
        List<Student> results = new ArrayList<>();
        for (Student s : students) {
            if (s.getFirstName().contains(keyword) || s.getLastName().contains(keyword)) {
                results.add(s);
            }
        }
        return results;
    }

}




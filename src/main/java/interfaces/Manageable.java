package interfaces;

import entities.Student;

import java.util.List;

public interface Manageable <Type>{
    void add(Type entity);
    boolean remove(String id);
    List<Student> getAll();
}


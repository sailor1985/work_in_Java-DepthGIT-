package OOP.DZ_to_Sem4.Service;

import OOP.DZ_to_Sem4.Model.Student;
import OOP.DZ_to_Sem4.Model.User;

import java.util.List;

public interface StudentService<T extends User> {
    void add(Student student);
    void remove(Student student);
    void addAppend(Student student);
    void read();
    List<Student> getAllStudents();
}
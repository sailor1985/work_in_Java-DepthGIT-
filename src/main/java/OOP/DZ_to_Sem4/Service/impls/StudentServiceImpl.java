package OOP.DZ_to_Sem4.Service.impls;

import OOP.DZ_to_Sem4.Model.Student;
import OOP.DZ_to_Sem4.Model.User;
import OOP.DZ_to_Sem4.Repository.StudentRepository;
import OOP.DZ_to_Sem4.Service.StudentService;

import java.util.List;

public class StudentServiceImpl<S extends User> implements StudentService {
    private final StudentRepository repository = new StudentRepository();
    @Override
    public void add(Student student) {
        if (student != null) {
            repository.save(student);
        } else {
            System.out.println("Student is null!");
        }
    }
    @Override
    public void remove(Student student) {
        repository.remove(student);
    }
    @Override
    public void addAppend(Student student) {
        if (student != null) {
            repository.saveAppend(student);
        } else {
            System.out.println("Student is null!");
        }
    }
    @Override
    public void read() {
        repository.read();
    }
    public List<Student> getAllStudents() {
        return repository.getAllStudents();
    }

}

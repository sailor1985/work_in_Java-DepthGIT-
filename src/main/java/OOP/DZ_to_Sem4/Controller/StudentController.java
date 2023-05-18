package OOP.DZ_to_Sem4.Controller;

import OOP.DZ_to_Sem4.Model.Student;
import OOP.DZ_to_Sem4.Model.Teacher;
import OOP.DZ_to_Sem4.Model.User;
import OOP.DZ_to_Sem4.Service.impls.StudentServiceImpl;

//Контроллер
public class StudentController {
    private final StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
    public void getStudentInfo(String name, float grade, int year, Teacher teacher){
        studentService.add(new Student(name, grade, year, teacher));
    }
}

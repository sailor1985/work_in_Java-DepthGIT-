package OOP.DZ_to_Sem4.Service;

import OOP.DZ_to_Sem4.Model.Teacher;
import OOP.DZ_to_Sem4.Model.User;

import java.util.List;

public interface TeacherService<T extends User> {
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    void addAppendTeacher(Teacher teacher);
    void readTeacher();
    List<Teacher> getAllTeachers();


}
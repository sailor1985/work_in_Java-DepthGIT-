package OOP.DZ_to_Sem4.Service.impls;

import OOP.DZ_to_Sem4.Model.Teacher;
import OOP.DZ_to_Sem4.Model.User;
import OOP.DZ_to_Sem4.Repository.TeacherRepository;
import OOP.DZ_to_Sem4.Service.TeacherService;

import java.util.List;

public class TeacherServiceImpl<S extends User> implements TeacherService {
    private final TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void addTeacher(Teacher teacher) {
        if (teacher != null) {
            teacherRepository.saveTeacher(teacher);
        } else {
            System.out.println("Teacher is null!");
        }
    }
    @Override
    public void removeTeacher(Teacher teacher) {
        teacherRepository.removeTeacher(teacher);
    }
    @Override
    public void addAppendTeacher(Teacher teacher) {
        if (teacher != null) {
            teacherRepository.saveAppendTeacher(teacher);
        } else {
            System.out.println("Teacher is null!");
        }
    }
    @Override
    public void readTeacher() {
        teacherRepository.readTeacher();
    }
    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.getAllTeachers();
    }
}

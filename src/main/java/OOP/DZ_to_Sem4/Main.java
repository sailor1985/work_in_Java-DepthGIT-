package OOP.DZ_to_Sem4;

import OOP.DZ_to_Sem4.Model.Student;
import OOP.DZ_to_Sem4.Model.Teacher;
import OOP.DZ_to_Sem4.Service.impls.StudentServiceImpl;
import OOP.DZ_to_Sem4.Service.impls.TeacherServiceImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

//        ДЕЙСТВИЯ СО СТУДЕНТАМИ
        System.out.println("\nДЕЙСТВИЯ СО СТУДЕНТАМИ\n");
        StudentServiceImpl<Student> studentService = new StudentServiceImpl<>();
        //Сохранение в файл студента
        Student Roman = new Student("Roman", 4.92f , 4, new Teacher("Алла Владимировна", new ArrayList<>()));
        studentService.add(Roman);

        //Добавление в файл студента
        Student Rurik = new Student("Rurik", 4.5f , 6, new Teacher("Ольга Симферопольна", new ArrayList<>()));
        Student Askold = new Student("Askold", 4.9f , 6, new Teacher("Алла Владимировна", new ArrayList<>()));
        studentService.addAppend(Rurik);
        studentService.addAppend(Askold);

        //Чтение из файла студентов
        studentService.read();

        //Удаление из файла студента Roman
        studentService.remove(Roman);

        //Добавление в файл студента Ahmat
        Student Ahmat = new Student("Ahmat", 4.3f , 8, new Teacher("Апты Алаутдинов", new ArrayList<>()));
        studentService.addAppend(Ahmat);

        //Получение списка всех студентов на текущую дату
        System.out.println(studentService.getAllStudents());

//        ДЕЙСТВИЯ С УЧИТЕЛЯМИ
        System.out.println("\nДЕЙСТВИЯ С УЧИТЕЛЯМИ\n");
        TeacherServiceImpl<Teacher> teacherService = new TeacherServiceImpl<>();

        //Сохранение в файл учителя Алла Владимиров и списка ее студентов
        List<Student> myStudents = new ArrayList<>();
        myStudents.add(Roman);
        myStudents.add(Askold);
        teacherService.addTeacher(new Teacher("Алла Владимировна", myStudents));

        //Добавление в файл учителя Ольга Симферопольна и списка ее студентов
        List<Student> myStudents2 = new ArrayList<>();
        myStudents2.add(Rurik);
        Teacher Olga = new Teacher("Ольга Симферопольна", myStudents2);
        teacherService.addAppendTeacher(Olga);

        //Чтение из файла учителей
        teacherService.readTeacher();

        //Удаление из файла учителя Ольга Симферопольна
        teacherService.removeTeacher(Olga);

        //Получение списка всех учителей на текущую дату
        System.out.println(teacherService.getAllTeachers());


//        StudentController studentStudentController  = new StudentController();
//        studentStudentController.getStudentInfo("Филипп", 4.44f, 2005, new Teacher("Ирина Львовна", new ArrayList<>()));
    }
}

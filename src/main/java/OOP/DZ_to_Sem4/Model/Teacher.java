package OOP.DZ_to_Sem4.Model;

import java.util.List;
import java.util.Objects;

public class Teacher extends User {
    private String name;
    private List<Student> group;
    public Teacher(String name, List<Student> group) {
        this.name = name;
        this.group = group;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Student> getGroup() {
        return group;
    }
    public void setGroup(List<Student> group) {
        this.group = group;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(this.getName(), teacher.getName());
    }
    @Override
    public int hashCode() {
        return Objects.hash(this.getName());
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", group=" + group +
                '}';
    }
}

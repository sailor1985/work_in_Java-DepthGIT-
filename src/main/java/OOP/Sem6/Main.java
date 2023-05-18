package OOP.Sem6;
// Придумать как сделать гибкое создание Worker (т.е любые комбинации при создании полей)
public class Main {
    public static void main(String[] args) {
        Worker employee1 = new Worker.EmployeeBuilder("Michael", "Petrov").setCabinet((byte) 111).setPhoneNumber(222).build();
        System.out.println(employee1);
        Worker employee2 = new Worker.EmployeeBuilder("Andrew", "Petrov").setCabinet((byte) 11).setSalary(100000).build();
        System.out.println(employee2);
        System.out.println(employee2.getName());
        Worker employee3 = new Worker.EmployeeBuilder("Michael", "Ivanov").setPassport(new Passport().setDateOfBirth(121)).build();
        System.out.println(employee3);
    }
}


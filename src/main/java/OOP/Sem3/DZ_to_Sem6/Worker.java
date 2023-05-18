package OOP.Sem3.DZ_to_Sem6;

import org.jetbrains.annotations.NotNull;

class Worker {
    private final String name;
    private final String lastName;
    private final float salary;
    private final Passport passport;
    private final int phoneNumber;
    private final byte cabinet;
    Worker(@NotNull EmployeeBuilder employeeBuilder) {
        name = employeeBuilder.name;
        lastName = employeeBuilder.lastName;
        salary = employeeBuilder.salary;
        passport = employeeBuilder.passportId;
        phoneNumber = employeeBuilder.phoneNumber;
        cabinet = employeeBuilder.cabinet;
    }
    public String getName() {
        return name;
    }
    public String getLastName() {
        return lastName;
    }
    public float getSalary() {
        return salary;
    }
    public Passport getPassport() {
        return passport;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public byte getCabinet() {
        return cabinet;
    }
      @Override
    public String toString () {
        String outName = name == null ? "" : "name='" + name + '\'';
        String outLastName = lastName == null ? "" : ", lastName='" + lastName + '\'';
        String outSalary = salary == 0 ? "" : ", salary=" + salary + '\'';
        String outPassport = passport == null ? "" : ", passport=" + passport;
        String outPhoneNumber = phoneNumber == 0 ? "" : ", phoneNumber=" + phoneNumber + '\'';
        String outCabinet = cabinet == 0 ? "" : ", cabinet=" + cabinet;
        return
                "Worker{" + outName + outLastName + outSalary + outPassport + outPhoneNumber + outCabinet + "}";
    }

}

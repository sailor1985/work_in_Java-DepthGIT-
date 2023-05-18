package OOP.Sem3.DZ_to_Sem6;

public class EmployeeBuilder {
        String name;
        String lastName;
        float salary;
        Passport passportId;
        int phoneNumber;
        byte cabinet;

        //constructor for required fields
        public EmployeeBuilder(String name, String lastName) {
            this.name = name;
            this.lastName = lastName;
        }

        //setter methods for optional fields
        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public EmployeeBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public EmployeeBuilder setSalary(float salary) {
            this.salary = salary;
            return this;
        }
        public EmployeeBuilder setPassportId(Passport passportId) {
            this.passportId = passportId;
            return this;
        }
        public EmployeeBuilder setPhoneNumber(int phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public EmployeeBuilder setCabinet(byte cabinet) {
            this.cabinet = cabinet;
            return this;
        }

        //Build the Employee object
        public Worker build() {
            return new Worker(this);
        }
    }

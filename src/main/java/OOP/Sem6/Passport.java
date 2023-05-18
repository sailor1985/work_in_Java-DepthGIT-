package OOP.Sem6;
    public class Passport {
        private long id;
        private String name;
        private String lastName;
        private long dateOfBirth;
        private float dateOfGiven;
        private long departmentCode;

        public long getId() {
            return id;
        }

        public Passport setId(long id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public Passport setName(String name) {
            this.name = name;
            return this;
        }

        public String getLastName() {
            return lastName;
        }

        public Passport setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public float getDateOfBirth() {
            return dateOfBirth;
        }

        public Passport setDateOfBirth(long dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public float getDateOfGiven() {
            return dateOfGiven;
        }

        public Passport setDateOfGiven(float dateOfGiven) {
            this.dateOfGiven = dateOfGiven;
            return this;
        }

        public long getDepartmentCode() {
            return departmentCode;
        }

        public Passport setDepartmentCode(long departmentCode) {
            this.departmentCode = departmentCode;
            return this;
        }
        @Override
        public String toString() {
            String outId = id == 0 ? "" : "id='" + id;
            String outName = name == null ? "" : "name='" + name + '\'';
            String outLastName = lastName == null ? "" : "lastName=" + lastName + '\'';
            String outDateOfBirth = dateOfBirth == 0 ? "" : "dateOfBirth=" + dateOfBirth;
            String outDateOfGiven = dateOfGiven == 0 ? "" : "dateOfGiven=" + dateOfGiven;
            String outDepartmentCode = departmentCode == 0 ? "" : "departmentCode=" + departmentCode;
            return
                    "Passport{" + outId +
                    outName + outLastName +
                    outDateOfBirth + outDateOfGiven +
                    outDepartmentCode + "}";
        }
    }


package hotel.employee.builder;

import hotel.employee.Employee;

public final class EmployeeBuilder {
    private String id;
    private String name;
    private String sinNumber;
    private String age;
    private String gender;

    public EmployeeBuilder() {
    }

    public static EmployeeBuilder anEmployee() {
        return new EmployeeBuilder();
    }

    public EmployeeBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public EmployeeBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public EmployeeBuilder withSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
        return this;
    }

    public EmployeeBuilder withAge(String age) {
        this.age = age;
        return this;
    }

    public EmployeeBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Employee build() {
        return new Employee(id, name, sinNumber, age, gender);
    }
}

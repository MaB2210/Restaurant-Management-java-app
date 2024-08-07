package hotel.employee.builder;

import hotel.employee.Manager;

public final class ManagerBuilder {
    private String id;
    private String name;
    private String sinNumber;
    private String age;
    private String gender;
    private String managerPhoneNumber;

    public ManagerBuilder() {
    }

    public static ManagerBuilder aManager() {
        return new ManagerBuilder();
    }

    public ManagerBuilder withId(String id) {
        this.id = id;
        return this;
    }

    public ManagerBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ManagerBuilder withSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
        return this;
    }

    public ManagerBuilder withAge(String age) {
        this.age = age;
        return this;
    }

    public ManagerBuilder withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public ManagerBuilder withManagerPhoneNumber(String managerPhoneNumber) {
        this.managerPhoneNumber = managerPhoneNumber;
        return this;
    }

    public Manager build() {
        Manager manager = new Manager();
        manager.setId(id);
        manager.setName(name);
        manager.setSinNumber(sinNumber);
        manager.setAge(age);
        manager.setGender(gender);
        manager.setManagerPhoneNumber(managerPhoneNumber);
        return manager;
    }
}

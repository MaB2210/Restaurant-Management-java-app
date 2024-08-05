package hotel.entity;

public abstract class Employee {

    private String id;
    private String name;
    private String sinNumber;
    private String age;
    private String gender;


    public Employee(String id, String name, String sinNumber, String age, String gender){
        this.id = id;
        this.name = name;
        this.sinNumber = sinNumber;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name, String id, String sinNumber){
        this.name = name;
        this.id = id;
        this.sinNumber = sinNumber;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinNumber() {
        return sinNumber;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public abstract void performDuty();
}

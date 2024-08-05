package hotel.entity;

public class Employee {

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

    public Employee(String name){
        this.name = name;
    }
    public Employee(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void performDuty(){
        System.out.println(name+ " performing duties");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public void setSinNumber(String sinNumber) {
        this.sinNumber = sinNumber;
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
}

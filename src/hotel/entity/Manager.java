package hotel.entity;

public class Manager extends Employee{

    public Manager(String name, String managerPhoneNumber ){
        super(name);
        this.managerPhoneNumber = managerPhoneNumber;
    }

    private String managerPhoneNumber;

    public String getManagerPhoneNumber() {
        return managerPhoneNumber;
    }

    public void setManagerPhoneNumber(String phoneNumber) {
        this.managerPhoneNumber = phoneNumber;
    }

    @Override
    public void performDuty(){
        System.out.println(this.getManagerPhoneNumber() + " is the phone number of Manager " + this.getName());
    }

}

package hotel.entity;

public class Manager extends Employee{

    public Manager(String name,String id, String sinNumber, String managerPhoneNumber ){
        super(name, id, sinNumber);
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
        System.out.println("Manager " + this.getName() + " is managing the employees.");
    }

}

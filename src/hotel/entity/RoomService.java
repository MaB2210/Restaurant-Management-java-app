package hotel.entity;

public class RoomService extends Employee {
    public RoomService(String name,String id,boolean smartServeCertificate){
        super(name,id);
        this.smartServeCertificate = smartServeCertificate;
    }


    private boolean smartServeCertificate;

    public boolean isSmartServeCertificate() {
        return smartServeCertificate;
    }

    public void setSmartServeCertificate(boolean smartServeCertificate) {
        this.smartServeCertificate = smartServeCertificate;
    }

    @Override
    public void performDuty(){
        if(smartServeCertificate == true){
            System.out.println("Employee name " + this.getName() + " and ID " + this.getId() + " is Smart Serve Certified");
        }
        else{
            System.out.println("Employee name " + this.getName() + " and ID " + this.getId() + " does not have Smart Serve Certification");
        }
    }
}

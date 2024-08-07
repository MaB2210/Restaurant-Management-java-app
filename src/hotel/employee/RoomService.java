package hotel.employee;

public class RoomService extends Employee {

    private boolean smartServeCertificate;

    public RoomService(String name,String id, String sinNumber, boolean smartServeCertificate){
        super();
        this.smartServeCertificate = smartServeCertificate;
    }

    public boolean isSmartServeCertificate() {
        return smartServeCertificate;
    }

    public void setSmartServeCertificate(boolean smartServeCertificate) {
        this.smartServeCertificate = smartServeCertificate;
    }

    @Override
    public void performDuty(){
        System.out.println("Room Service employee " + this.getName() +" cleaning the rooms.");
    }
}

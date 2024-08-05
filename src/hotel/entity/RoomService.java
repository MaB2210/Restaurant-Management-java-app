package hotel.entity;

public class RoomService{
    public RoomService(String name,boolean smartServeCertificate){
        super();
        this.smartServeCertificate = smartServeCertificate;
    }

    private boolean smartServeCertificate;

    public boolean isSmartServeCertificate() {
        return smartServeCertificate;
    }

    public void setSmartServeCertificate(boolean smartServeCertificate) {
        this.smartServeCertificate = smartServeCertificate;
    }



}

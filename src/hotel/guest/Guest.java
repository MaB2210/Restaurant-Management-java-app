package hotel.guest;

public class Guest {

    private String name;
    private String phoneNumber;
    private String Address;
    private String guestIdentificationProof;
    private String guestRoomNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getGuestIdentificationProof() {
        return guestIdentificationProof;
    }

    public void setGuestIdentificationProof(String guestIdentificationProof) {
        this.guestIdentificationProof = guestIdentificationProof;
    }

    public String getGuestRoomNumber() {
        return guestRoomNumber;
    }

    public void setGuestRoomNumber(String guestRoomNumber) {
        this.guestRoomNumber = guestRoomNumber;
    }
}

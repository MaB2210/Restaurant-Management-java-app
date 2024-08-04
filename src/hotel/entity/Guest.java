package hotel.entity;

public class Guest {

    private String name;
    private String phoneNumber;
    private String Address;
    private String guestIdentificationProof;

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
}

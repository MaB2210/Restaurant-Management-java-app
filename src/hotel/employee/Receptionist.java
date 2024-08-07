package hotel.employee;

public class Receptionist extends Employee {

    private String[] languagesKnown;

    public Receptionist(String name, String id, String sinNumber, String[] languagesKnown){
        super();
        this.languagesKnown = languagesKnown;
    }
    public String[] getLanguagesKnown() {
        return languagesKnown;
    }

    public void setLanguagesKnown(String[] languagesKnown) {
        this.languagesKnown = languagesKnown;
    }

    @Override
    public void performDuty(){
        System.out.println("Receptionist " + getName() + " registering the guests.");
    }
}

package hotel.entity;

public class Receptionist extends Employee {
    public Receptionist(String name,String languagesKnown){
        super(name);
        this.languagesKnown = languagesKnown;
    }

    private String languagesKnown;

    public String getLanguagesKnown() {
        return languagesKnown;
    }

    public void setLanguagesKnown(String languagesKnown) {
        this.languagesKnown = languagesKnown;
    }

    @Override
    public void performDuty(){
        System.out.println("Employee named " + getName() + " knows " + languagesKnown + " languages.");
    }
}

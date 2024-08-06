package hotel.employee;

public class Cook extends Employee {
    public Cook (String name, String id, String sinNumber, String cuisine, boolean foodCertification){
        super(name, id, sinNumber);
        this.cuisine=cuisine;
        this.foodCertification=foodCertification;
    }

    private String cuisine;
    private boolean foodCertification;

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public boolean isFoodCertification() {
        return foodCertification;
    }

    public void setFoodCertification(boolean foodCertification) {
        this.foodCertification = foodCertification;
    }

    @Override
    public void performDuty(){
        System.out.println("Cook " +this.getName()+" is cooking " +this.cuisine+" food.");
    }
}

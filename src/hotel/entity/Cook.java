package hotel.entity;

public class Cook extends Employee {
    public Cook(String name, String cuisine, boolean foodCertification){
        super(name);
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
        if(foodCertification == true){
            System.out.println("Chef " + getName() + "is expert in " + getCuisine() + " Cuisine and is Food Safety Certified.");
        }
        else {
            System.out.println("Chef " + getName() + "is expert in " + getCuisine() + " Cuisine But is not  Food Safety Certified.");
        }
    }
}

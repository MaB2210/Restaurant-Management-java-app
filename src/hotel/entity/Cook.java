package hotel.entity;

public class Cook {

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
}

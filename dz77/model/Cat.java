package dz77.model;

public class Cat {
    public String name;
    public boolean satiety = false;
    public int foodForSatiety = 0;

    public Cat(String name, int foodForSatiety) {
        this.name = name;
        this.foodForSatiety = foodForSatiety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public int getFoodForSatiety() {
        return foodForSatiety;
    }

    public void setFoodForSatiety(int foodForSatiety) {
        this.foodForSatiety = foodForSatiety;
    }
}

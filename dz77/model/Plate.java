package dz77.model;

public class Plate {
    public int foodCount = 0;

    public Plate(int foodCount) {
        if(foodCount < 0){
            this.foodCount = 0;
            return;
        }
        this.foodCount = foodCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        if(foodCount < 0){
            this.foodCount = 0;
            return;
        }
        this.foodCount = foodCount;
    }
}

package dz77;

import dz77.model.Cat;
import dz77.model.Plate;
import dz77.service.CatService;

public class Main {
    public static void main(String[] args) {
     startApp();
    }

    private static void startApp(){
        Cat[] cats = new Cat[2];
        cats[0] = new Cat("Петя",6);
        cats[1] = new Cat("Вася", 10);
        Plate plate = new Plate(10);
        cats = CatService.food(cats,plate.foodCount);
        plate.setFoodCount(20);
        cats = CatService.food(cats,plate.foodCount);
    }
}

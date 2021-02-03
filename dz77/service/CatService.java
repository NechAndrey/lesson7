package dz77.service;

import dz77.model.Cat;
import dz77.model.Plate;

public class CatService {

    public static Cat[] food(Cat[] cats, int foodCount){
        for (int i = 0; i <cats.length ; i++) {
            if(foodCount - cats[i].foodForSatiety > 0){
                cats[i].satiety = true;
                foodCount -= cats[i].foodForSatiety;
            }
        }
        printStatusCat(cats);
        return cats;
    }

    public static void printStatusCat(Cat[] cats){
        for (int i = 0; i < cats.length; i++) {
            String s =  cats[i].satiety ? "Сытый" : "Голодный, пополните тарелку";
            System.out.println(cats[i].name + " " + s);
        }
    }
}

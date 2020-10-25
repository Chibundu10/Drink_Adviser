package com.drinkadviser;

import java.util.ArrayList;
import java.util.List;

public class DrinkExpert {
    List<String> getBrands(String color){

        List<String> brands = new ArrayList<>();
        if (color.equals("Light")){
            brands.add("Sprite, 7up, Water");
        }
        else if (color.equals("Orange")){
            brands.add("Fanta, Marinda, Bigi-Fanta");
            brands.add("5-Alive, Chivita, Luckozed Boost");
        }
        else if (color.equals("Dark")){
            brands.add("Maltina, Hi-Malt, Beta Malt");
            brands.add("Coca-Cola, Bigi-Cola");
        }
        return brands;
    }

}

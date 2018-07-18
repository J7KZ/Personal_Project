package com.epam.newyear.gift.candy.concrete;

import com.epam.newyear.gift.candy.Candy;
import com.epam.newyear.gift.candy.ingredient.Ingredient;
import com.epam.newyear.gift.candy.ingredient.concrete.Caramel;
import com.epam.newyear.gift.candy.ingredient.concrete.Jujube;
import com.epam.newyear.gift.candy.ingredient.concrete.Sugar;

public class JujInMarmComfit extends Candy {

    public JujInMarmComfit(String name, String production) {
        super(name, production);
    }
    
    @Override
    public void manufacture() {
        ingredients = new Ingredient[3];
        ingredients[0] = new Jujube("Мармелад лимонный", 10);
        ingredients[1] = new Caramel("Карамель яблочная", 15);
        ingredients[2] = new Sugar("Сахар", 20);
    }

}

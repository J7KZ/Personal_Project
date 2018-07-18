package com.epam.newyear.gift.candy.concrete;

import com.epam.newyear.gift.candy.Candy;
import com.epam.newyear.gift.candy.ingredient.Ingredient;
import com.epam.newyear.gift.candy.ingredient.concrete.Chocolate;
import com.epam.newyear.gift.candy.ingredient.concrete.Sugar;

public class AlenushkaChocolate extends Candy {

    public AlenushkaChocolate(String name, String production) {
        super(name, production);
    }

    @Override
    public void manufacture() {
        ingredients = new Ingredient[2];
        ingredients[0] = new Chocolate("Шоколад", 100);
        ingredients[1] = new Sugar("Сахар свекловой", 20);
    }

}

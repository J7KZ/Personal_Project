package com.epam.newyear.gift.candy.concrete;

import com.epam.newyear.gift.candy.Candy;
import com.epam.newyear.gift.candy.ingredient.Ingredient;
import com.epam.newyear.gift.candy.ingredient.concrete.Chocolate;
import com.epam.newyear.gift.candy.ingredient.concrete.Sugar;
import com.epam.newyear.gift.candy.ingredient.concrete.Waffle;

public class BearInTheNorthComfit extends Candy {

    public BearInTheNorthComfit(String name, String production) {
        super(name, production);
    }

    @Override
    public void manufacture() {
        ingredients = new Ingredient[3];
        ingredients[0] = new Sugar("������������ �����", 7);
        ingredients[1] = new Waffle("����� � ���������� ���������", 2);
        ingredients[2] = new Chocolate("������� ������", 15);
    }

}

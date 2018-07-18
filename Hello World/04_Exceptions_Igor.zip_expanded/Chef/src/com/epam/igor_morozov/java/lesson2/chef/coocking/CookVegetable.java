package com.epam.igor_morozov.java.lesson2.chef.coocking;

import com.epam.igor_morozov.java.lesson2.chef.ingridients.vegetables.Vegetable;

public class CookVegetable implements ICookVegetables {

	private boolean workIsDone = true;

	@Override
	public Vegetable coock(Vegetable vegetable) {
		wash(vegetable);
		if (((Vegetable) vegetable).isNeedPeel())
			peel(vegetable);
		slice(vegetable);

		return vegetable;
	}

	@Override
	public void wash(Vegetable vegetable) {
		vegetable.setClean(workIsDone);
	}

	@Override
	public void peel(Vegetable vegetable) {
		vegetable.setPeeled(workIsDone);
	}

	@Override
	public void slice(Vegetable vegetable) {
		vegetable.setCliced(workIsDone);

	}

}

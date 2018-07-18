package com.epam.igor_morozov.java.lesson2.data;

import com.epam.igor_morozov.java.lesson2.chef.storage.in.used.Container;
import com.epam.igor_morozov.java.lesson2.data.sauces.Mayonnaise;
import com.epam.igor_morozov.java.lesson2.data.sauces.StarDust;
import com.epam.igor_morozov.java.lesson2.data.vegetables.*;

public class DataSourse implements Data {

	private Container basket = new Container();
	private Container sauces = new Container();

	public DataSourse() {
		set();
	}

	@Override
	public void set() {

	/*
			 basket.add(new Potato(10.1f));			 
			 basket.add(new Potato(10.1f));			
			 basket.add(new Tomato(0.5f)); 
			 basket.add(new Cucumber(6.1f)); 
			 basket.add(new Carrot(8.1f));
		*/
		
		 /*
		sauces.add(new Mayonnaise());
		sauces.add(new StarDust());
		*/

	}

	@Override
	public Container getBasket() {

		return basket;
	}

	@Override
	public Container getSausage() {

		return sauces;
	}

}

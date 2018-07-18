package com.epam.sergey_kuznetsov.java.lesson2.task2;


public class MasterChef {

	public static void main(String[] args) {
		MasterChef chefApplication = new MasterChef();
		chefApplication.startApplication();
	}

	private void startApplication() {
		Service.run();
	}
}

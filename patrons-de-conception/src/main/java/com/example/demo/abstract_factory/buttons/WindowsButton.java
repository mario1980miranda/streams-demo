package com.example.demo.abstract_factory.buttons;

/**
 * All products families have the same varieties (MacOs/Windows)
 * 
 * This is a Windows variant of a button.
 * @author Mario
 *
 */
public class WindowsButton implements Button {

	@Override
	public void paint() {

		System.out.println("You have created WindowsButton.");
	}

}

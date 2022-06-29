package com.example.demo.abstract_factory.checkboxes;

/**
 * This is a Windows variant of a checkbox.
 * @author Mario
 *
 */
public class WindowsCheckbox implements Checkbox {

	@Override
	public void paint() {

		System.out.println("You have created WindowsCheckbox.");
	}

}

package com.example.demo.abstract_factory.factories;

import com.example.demo.abstract_factory.buttons.Button;
import com.example.demo.abstract_factory.buttons.MacOSButton;
import com.example.demo.abstract_factory.checkboxes.Checkbox;
import com.example.demo.abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and reponsible for creating
 * products of a single variety.
 * @author Mario
 *
 */
public class MacOSFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}

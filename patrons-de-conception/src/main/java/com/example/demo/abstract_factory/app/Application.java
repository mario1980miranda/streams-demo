package com.example.demo.abstract_factory.app;

import com.example.demo.abstract_factory.buttons.Button;
import com.example.demo.abstract_factory.checkboxes.Checkbox;
import com.example.demo.abstract_factory.factories.GUIFactory;

/**
 * Factory users don't care which concrete factory the use since the work with
 * factories and products through abstract interfaces.
 * @author Mario
 *
 */
public class Application {

	private Button button;
	private Checkbox checkbox;
	
	public Application(GUIFactory factory) {
		button = factory.createButton();
		checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
}

package com.example.demo.abstract_factory.factories;

import com.example.demo.abstract_factory.buttons.Button;
import com.example.demo.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about all (abstract) product types.
 * @author Mario
 *
 */
public interface GUIFactory {

	Button createButton();
	Checkbox createCheckbox();
}

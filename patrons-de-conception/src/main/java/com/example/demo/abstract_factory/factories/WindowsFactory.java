package com.example.demo.abstract_factory.factories;

import com.example.demo.abstract_factory.buttons.Button;
import com.example.demo.abstract_factory.buttons.WindowsButton;
import com.example.demo.abstract_factory.checkboxes.Checkbox;
import com.example.demo.abstract_factory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}

}

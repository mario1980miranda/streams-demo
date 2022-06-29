package com.example.demo.factory_method.buttons;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		
		return new WindowsButton();
	}

}

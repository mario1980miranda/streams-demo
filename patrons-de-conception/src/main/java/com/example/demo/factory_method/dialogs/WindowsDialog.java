package com.example.demo.factory_method.dialogs;

import com.example.demo.factory_method.buttons.Button;
import com.example.demo.factory_method.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		
		return new WindowsButton();
	}

}

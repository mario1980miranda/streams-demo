package com.example.demo.factory_method.dialogs;

import com.example.demo.factory_method.buttons.Button;
import com.example.demo.factory_method.buttons.HtmlButton;

/**
 * Html Dialog will produce HTML buttons.
 * @author Mario
 *
 */
public class HtmlDialog extends Dialog {

	@Override
	public Button createButton() {
		
		return new HtmlButton();
	}

}

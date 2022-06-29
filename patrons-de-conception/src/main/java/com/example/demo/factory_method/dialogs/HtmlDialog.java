package com.example.demo.factory_method.buttons;

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

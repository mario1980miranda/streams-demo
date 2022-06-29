package com.example.demo.factory_method.dialogs;

import com.example.demo.factory_method.buttons.Button;

/**
 * Base factory class. Note that "factory" is merely a role for the class.
 * It should have some business logic which needs different products to be
 * created.
 * @author Mario
 *
 */
public abstract class Dialog {

	public void renderWindow() {
		
		// ... other code ...
		
		Button okButton = createButton();
		okButton.render();
	}
	
	/**
	 * Subclasses will override this method in order to create spcific button
	 * objects.
	 */
	public abstract Button createButton();
	
}

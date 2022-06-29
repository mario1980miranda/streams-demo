package com.example.demo.factory_method;

import com.example.demo.factory_method.dialogs.Dialog;
import com.example.demo.factory_method.dialogs.HtmlDialog;
import com.example.demo.factory_method.dialogs.WindowsDialog;

/**
 * Everything comes together here.
 * @author Mario
 *
 */
public class DemoFactoryMethod {

	private static Dialog dialog;
	
	public static void main(String[] args) {

		configure();
		runBusinessLogic();
	}

	/**
	 * The concrete factory is usually chosen depending on configuration or
	 * environment options.
	 */
	static void configure() {
		
		if (System.getProperty("os.name").equals("Windows 11")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	/**
	 * All of the client code should work with factories and products through
	 * abstract interfaces. This way it does not care which factory it works
	 * with and what kind of product it returns.
	 */
	static void runBusinessLogic() {
		
		dialog.renderWindow();
	}
	
}

package com.example.demo.abstract_factory;

import com.example.demo.abstract_factory.app.Application;
import com.example.demo.abstract_factory.factories.GUIFactory;
import com.example.demo.abstract_factory.factories.MacOSFactory;
import com.example.demo.abstract_factory.factories.WindowsFactory;

/**
 * Everything comes togheter here.
 * @author Mario
 *
 */
public class DemoAbstractFactory {

	/**
	 * Application picks the factory type and creates it in run time (usually at
	 * initialization stage), depending on the configuration or environment 
	 * variables.
	 * @param args
	 */
	private static Application configureApplication() {
		
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		
		if (osName.contains("mac")) {
			factory = new MacOSFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		
		return app;
	}
	
	public static void main(String[] args) {

		Application app = configureApplication();
		app.paint();
	}

}

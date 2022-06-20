package com.example.demo.decorators;

/**
 * Une interface commune qui définit les traitements de lecture et d'écrite
 * @author Mario
 *
 */
public interface DataSource {

	void writeData(String data);
	String readData();
}

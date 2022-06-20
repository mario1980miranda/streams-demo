package com.example.demo.decorators;

/**
 * Décorateur de base abstraite
 * @author Mario
 *
 */
public abstract class DataSourceDecorator implements DataSource {

	private DataSource wrappee;
	
	public DataSourceDecorator(DataSource source) {
		this.wrappee = source;
	}
	
	@Override
	public void writeData(String data) {
		wrappee.writeData(data);
	}

	@Override
	public String readData() {
		return wrappee.readData();
	}

}

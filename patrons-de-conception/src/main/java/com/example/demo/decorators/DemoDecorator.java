package com.example.demo.decorators;

public class DemoDecorator {

	public static void main(String[] args) {

		String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";
		DataSourceDecorator encoded = new CompressionDecorator(
									  		new EncryptationDecorator(
									  				new FileDataSource("C:\\ws-sts\\patrons-de-conception\\src\\main\\java\\com\\example\\demo\\decorators\\out\\OutputDemo.txt")));
		
		encoded.writeData(salaryRecords);
		DataSource plain = new FileDataSource("C:\\ws-sts\\patrons-de-conception\\src\\main\\java\\com\\example\\demo\\decorators\\out\\OutputDemo.txt");
		
        System.out.println("- Input ----------------");
        System.out.println(salaryRecords);
        System.out.println("- Encoded --------------");
        System.out.println(plain.readData());
        System.out.println("- Decoded --------------");
        System.out.println(encoded.readData());
	}

}

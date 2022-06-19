package com.example.demo.observer;

import com.example.demo.observer.editor.Editor;
import com.example.demo.observer.listeners.EmailNotificationListener;
import com.example.demo.observer.listeners.LogOpenListener;

public class Demo {

	public static void main(String[] args) {
		Editor editor = new Editor();
		editor.events.subscribe("open", new LogOpenListener("C:\\ws-sts\\patrons-de-conception\\src\\main\\java\\com\\example\\demo\\observer\\file.txt"));
		editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
		
		try {
			editor.openFile("test.txt");
			editor.saveFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

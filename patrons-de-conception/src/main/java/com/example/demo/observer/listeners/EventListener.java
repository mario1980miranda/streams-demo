package com.example.demo.observer.listeners;

import java.io.File;

/**
 * Interface observateur commune
 * @author Mario
 *
 */
public interface EventListener {
	void update(String eventType, File file);
}

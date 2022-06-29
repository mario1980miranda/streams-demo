package com.example.demo.abstract_factory.buttons;

/**
 * Abstract factory assumes that you have several families of products,
 * structured into separeted class hierarchies (Button/Checkbox). All products of
 * the same family have common interface.
 * 
 * This is the common interface for buttons family.
 * 
 * @author Mario
 *
 */
public interface Button {

	void paint();
}

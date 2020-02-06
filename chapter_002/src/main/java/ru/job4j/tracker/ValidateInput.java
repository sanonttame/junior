package ru.job4j.tracker;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Что по сути делает класс ValidateInput - он получает данные
 * из системы до тех под пока не введут правильные символы.
 */
public class ValidateInput implements Input {

	private final Input input;

	public ValidateInput(final Input input) {
		this.input = input;
	}

	@Override
	public String ask(String question) {
		return this.input.ask(question);
	}

	@Override
	public int ask(String question, ArrayList<Integer> range) {
		boolean invalid = true;
		int value = -1;
		do {
			try {
				value = this.input.ask(question, range);
				invalid = false;
			} catch (MenuOutException moe) {
				System.out.println("Please select key from menu.");
			} catch (NumberFormatException nfe) {
				System.out.println("Please enter validate data again.");
			}
		} while (invalid);
		return  value;
	}
}

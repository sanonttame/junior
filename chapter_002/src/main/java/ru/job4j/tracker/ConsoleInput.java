package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Класс используется для ввода пользовательских данных с консоли.
 */
public class ConsoleInput implements Input {
	private Scanner scanner = new Scanner(System.in);

	public String ask(String question) {
		System.out.print(question);
		return scanner.nextLine();
	}

	public int ask(String question, int[] range) {
		int key = Integer.valueOf(this.ask(question));
		boolean exist = false;
		for (int value : range) {
			if (value == key) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			throw new MenuOutException("вы вышли за пределы меню");
		}
		return key;
	}
}

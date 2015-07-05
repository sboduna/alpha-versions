package Collections;

import java.util.*;

class VectorDemo {
	public static void main(String args[]) {
		Vector<Integer> v = new Vector<Integer>(3, 2);
		System.out.println("Начальный размер: " + v.size());
		System.out.println("Начальная ёмкость: " + v.capacity());

		v.addElement(1);
		v.addElement(2);
		v.addElement(3);
		v.addElement(4);

		System.out.println("Ёмкость после четырёх добавлений: " + v.capacity());

		v.addElement(5);
		System.out.println("Текущая ёмкость: " + v.capacity());

		v.addElement(6);
		v.addElement(7);

		System.out.println("Текущая ёмкость: " + v.capacity());

		v.addElement(9);
		v.addElement(10);

		System.out.println("Текущая ёмкость: " + v.capacity());

		v.addElement(11);
		v.addElement(12);

		System.out.println("Первый элемент: " + v.firstElement());
		System.out.println("Последний элемент: " + v.lastElement());

		if (v.contains(3))
			System.out.println("Вектор содержит 3.");

		Enumeration<Integer> vEnum = v.elements();

		System.out.println("\nЭлементы вектора:");
		while (vEnum.hasMoreElements())
			System.out.print(vEnum.nextElement() + " ");
		System.out.println();
	}
}

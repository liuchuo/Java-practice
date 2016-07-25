package net.liuchuo;

import java.util.HashSet;
import java.util.Set;

import com.sun.swing.internal.plaf.metal.resources.metal_zh_TW;

public class MyfirstApp {
	public static void main(String[] args) {
		System.out.println("I Rule! The World");
		System.out.println("Hello World!");
		System.out.println(Math.random());
		double a = Double.parseDouble("23333");
		System.out.println(a);
		int[] arr = new int[8];
		for(int i = 0; i < 8; i++) {
			arr[i] = i;
		}
		Dog myDog = new Dog();
		for(int i:arr) {
			i = 8;
			System.out.print(i);
		}
		int size = 3;
		int r = (int)(Math.random() * 5);
		System.err.println(r);
		
	}
}
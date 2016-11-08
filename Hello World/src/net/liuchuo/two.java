package net.liuchuo;

public class two extends one {

	private two() {

	}

	public static void print() {
		System.out.println("aaa");
	}
}

class Test {
	public static void main(String[] args) {
		two t = new two();
	}
}



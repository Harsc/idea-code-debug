package com.example;

/**
 * debug code one
 */
public class Main {


	private static void numberPrint(int i) {
		System.out.println("exe raw this :" + i);
	}

	private static void printLN(String s) {
		System.out.println("value is" + s);
	}


	private static void getMessage() {
		System.out.println("我是来自南方的一条龙");
		System.out.println("我一定会变得非常受人尊敬，和nice and very 前");
		String s = String.valueOf(2);
		printLN(s);
//        throw new RuntimeException();
	}

//    TODO  行断点 源码断点 方法断点 异常断点

	public static void main(String[] args) {
		getMessage();

		User user = new User("jone", 25);

		for (int i = 0; i < 1000; i++) {
			numberPrint(i);
		}
		if (user.getName().isEmpty()) {
			System.out.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		}
		System.out.println("我最美，我最帅，我不管");
	}
}

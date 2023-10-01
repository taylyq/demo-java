package demo_java;

public class arrayFruits {
	public static void main(String[] args) {
		String[] fruits = {
				"Apple","Banana","Cherry","Grape","Orange"};
	for (int i = 0;i < fruits.length; i++) {
		System.out.println("Fruit #" + (i+1) +";" +fruits[i]);
	}
	}
}

package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
		//練習問題１１
		PracticeTest8 prc = new PracticeTest8();
		//問１
		prc.printHello();
		//問２
		prc.printRandomMessage();
		//問３
		prc.printMessage("Hello");
		//問４
		prc.printMessage("Hello",5);
		//問５
		prc.printRectangleArea(10, 35);
		//問６
		System.out.println(prc.getWeatherForecast());
		//問７
		System.out.println(prc.isEvenNumber(5));
		//問８
		System.out.println(prc.getMessage("A", true));
		//問９
		String[] animal = {"いぬ", "ねこ", "オオカミ", "うさぎ", "フクロウ"};
		System.out.println(prc.getLongestString(animal));
		//問１０
		Person per = new Person("B",23);
		System.out.println(prc.isAdult(per));	
	}
}

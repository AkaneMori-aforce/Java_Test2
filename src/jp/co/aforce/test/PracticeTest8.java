package jp.co.aforce.test;

public class PracticeTest8 {
	//練習問題１
	public void printHello() {
		System.out.println("Hello");
	}
	//練習問題２
	public void printRandomMessage() {
		String[] hello = {"こんばんは", "こんにちは", "おはよう"};
		int n =  (int) (hello.length * Math.random());
		System.out.println(hello[n]);	}
	//練習問題３
	public void printMessage(String message) {
		System.out.println(message);
	}
	//練習問題４
	public void printMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	//練習問題５
	public void printRectangleArea(double height, double width) {
		System.out.println(height * width);
	}
	//練習問題６
	public String getWeatherForecast() {
		String[] day = {"今日", "明日", "明後日"};
		String[] weather = {"晴れ", "曇り", "雨", "雪"};
		int n =  (int) (day.length * Math.random());
		int m =  (int) (weather.length * Math.random());
		return day[n] + "の天気は" + weather[m] + "でしょう。";
	}
	//練習問題７
	public boolean isEvenNumber(int value) {
		if(value % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	//練習問題８
	public String getMessage(String name, boolean isKid) {
		if(isKid = true) {
			return "こんにちは。" + name + "ちゃん。";
		} else {
			return "こんにちは。" + name + "さん。";
 		}
	}
	//練習問題９
	public String getLongestString(String[] array) {
		int Max = array[0].length();
		int n = 0;
		for (int i = 1; i < array.length; i++) {
			if(Max <= array[i].length()) {
		        Max = array[i].length();
		        n = i;
		    }
		}
		return array[n];
	}
	//練習問題１０
	public boolean isAdult(Person person) {
		if(person.getAge() >= 20) {
			return true;
		} else {
			return false;
		}
	}
}

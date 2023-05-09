package jp.co.aforce.test;

public class Fighter extends Airplane{
	@Override
	public void fly(){
		System.out.println("飛行します");
	}
	public void fight(){
		System.out.println("戦闘します");
	}
}

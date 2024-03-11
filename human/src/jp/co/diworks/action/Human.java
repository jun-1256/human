package jp.co.diworks.action;

public class Human {

	public static void main(String[] args) {
		
		// 『変数abcの中に、HumaNameクラスのコピーが代入される。』という意味。
		// 『HumanName』とは、『HumaName.java』と『public class HumanName』のHumaNameを指している。
		HumanName abc=new HumanName();
		System.out.println(abc.getName());
		
		HumanAge efg=new HumanAge();
		System.out.println(efg.getAge());
		
		HumanAddress hij=new HumanAddress();
		System.out.println(hij.getAddress());
	}

}

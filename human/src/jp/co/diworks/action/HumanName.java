package jp.co.diworks.action;

//『HumaName.java 』と『 public class HumanName 』は 
//同じ名前にしないとダメ(クラス(=ファイル作成)の時に自動的に同じ名前で作られる)

public class HumanName {

	public String lastName;
	private String firstName;
	public String getName() {
		firstName="山田";
		lastName="太郎";
		String myName=firstName+lastName;
		return myName;
	}
	
}

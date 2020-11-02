package test;

import java.util.ArrayList;

public class Test {

	public static String dataFlag = "A";

	public static void main(String[] args) {
		
		ArrayList<String> datas = new ArrayList<>(); 
		if(dataFlag.equals("A")) {
			datas = new StoreA().datas;
		} else if(dataFlag.equals("B")){
			datas = new StoreB().datas;
		}
		
		for(int i = 0; i < datas.size(); i++) {
			System.out.println(datas.get(i));
		}
		
	}
}

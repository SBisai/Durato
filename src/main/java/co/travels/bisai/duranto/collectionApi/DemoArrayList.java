package co.travels.bisai.duranto.collectionApi;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> aL = new ArrayList<String>();
		aL.add("CityLight");
		aL.add("Interlight");
		aL.add("Garib Rath");
		System.out.println(aL);
		aL.add(0,"Bus Name");
		System.out.println(aL);
		aL.remove(0);
		//aL.removeAll(aL) 
		System.out.println(aL.get(2));// to fetch data 
		System.out.println(aL.contains("Interlight"));
		System.out.println(aL.indexOf("Interlight"));
		System.out.println(aL.isEmpty());
		System.out.println(aL.size());

	}

}

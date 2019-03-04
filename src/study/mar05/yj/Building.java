package study.mar05.yj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Building {
	public String name = "";
	public String adress = "";
	public String manager = "";
	public int floorNum = 0;
	public int roomNum = 0;
	
	public static void main(String[] args) {
		Building jeiPlatz = new Building();
		Building wooRim = new Building();
		
		List<Building> biList = new ArrayList<>();
		Map<Integer, Building> biMap1 = new HashMap<>();
		Map<Building, Integer> biMap2 = new HashMap<>();
		List<Map<Integer, Building>> biListMap = new ArrayList<>();
		
		
		jeiPlatz.name = "제이플라츠1";
		System.out.println(jeiPlatz.name);
		System.out.println(jeiPlatz);
		
		biList.add(jeiPlatz);
		biList.get(0).name = "제이플라츠2";
		System.out.println(biList.get(0).name);
		System.out.println(biList.get(0));
		
		biMap1.put(10000, jeiPlatz);
		biMap1.get(10000).name = "제이플라츠3";
		System.out.println(biMap1.get(10000).name);
		System.out.println(biMap1.get(10000));
		
		biListMap.add(biMap1);
		biListMap.get(0).put(10000, jeiPlatz);
		biListMap.get(0).get(10000).name = "제이플라츠4";
		System.out.println(biListMap.get(0).get(10000).name);
		System.out.println(biListMap.get(0).get(10000));
		
		
	}
}

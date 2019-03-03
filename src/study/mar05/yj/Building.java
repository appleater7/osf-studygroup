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
		Map<Building, Integer> biMap = new HashMap<>();
		List<Map<Building, Integer>> biListMap = new ArrayList<>();
	}
}

package model;

import java.util.HashMap;
import java.util.Map;

public class MatriceItemSet {
	
	private int matriceItemSet[][];
	private Map<Integer,String> correspondanceColonne ;
	
			
	public MatriceItemSet(int nombreItem,int nombreItemSet){
		matriceItemSet = new int[nombreItemSet][nombreItem];
		correspondanceColonne = new HashMap<Integer,String>();
	}
	
	
	

}

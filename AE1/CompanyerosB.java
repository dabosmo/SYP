package AE1;

import java.util.ArrayList;
import java.util.List;

public class CompanyerosB {

	public static void main(String[] args) {
		
		List<String> comps = new ArrayList<String>();
		
		comps.add("Daniel");
		comps.add("Victor");
		comps.add("Alejandra");
		comps.add("Laura");
		comps.add("Javier");
		comps.add("Carmen");
		
		for(int i = 0; i < 6; i++) {
			
			System.out.println(comps.get(i));
		}
	}

}

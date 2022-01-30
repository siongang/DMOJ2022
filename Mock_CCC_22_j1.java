package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mock_CCC_22_j1 {
	public static void main (String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		int i = Integer.parseInt(br.readLine()) ;		
		int j = Integer.parseInt(br.readLine());		
		
		if (Math.abs(n - i*i) < Math.abs(n - j*j)) {
			System.out.println(1);
			
			
			
		} else {
			System.out.println(2);
			
		}
	}
}

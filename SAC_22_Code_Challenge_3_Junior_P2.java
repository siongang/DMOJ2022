package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SAC_22_Code_Challenge_3_Junior_P2 {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr1 = br.readLine().split(" ");
		String[] arr2 = br.readLine().split(" ");
		
		if (Integer.parseInt(arr1[1]) == Integer.parseInt(arr2[1])) {
			System.out.println("x-axis");
		} else if (Integer.parseInt(arr1[0]) == Integer.parseInt(arr2[0])) {
			System.out.println("y-axis");
		} else {
			System.out.println("neither");
		}
		}
}

package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SAC_22_Code_Challenge_3_Junior_P4 {
	public static void main (String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		for (int i = 0; i < num; i++) {
			String[] ar = br.readLine().split(" ");
			int b1 = Integer.parseInt(ar[0]);
			String N = (ar[1]);
			int b2 = Integer.parseInt(ar[2]);
			double number = 0;
			System.out.println(baseConversion(N, b1, b2));
			
	}

}
	public static String
    baseConversion(String number, int sBase, int dBase)
    {
    
        return Integer.toString(Integer.parseInt(number, sBase), dBase);
    }
}
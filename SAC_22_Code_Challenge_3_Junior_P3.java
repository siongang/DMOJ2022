package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SAC_22_Code_Challenge_3_Junior_P3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		double sum = 1;
		for (int i = 0; i < num; i++) {
			String let = br.readLine();
			if (let.equals("A")) {
				sum = sum * 1;
			} else if (let.equals("B")) {
				sum = sum * 0.8;
			} else if (let.equals("C")) {
				sum = sum * 0.6;
			} else if (let.equals("D")) {
				sum = sum * 0.4;
			} else if (let.equals("E")) {
				sum = sum * 0.2;
			}
		}
		System.out.println(sum);
	}
}

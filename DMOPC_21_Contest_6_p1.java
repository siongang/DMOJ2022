package DMOJ;

import java.io.*;
import java.util.*;

public class DMOPC_21_Contest_6_p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int D = Integer.parseInt(br.readLine());
		String[] num = br.readLine().split("");
		String temp = "";
	
		for (int i = 0; i < D-1; i++) {
			if ((Integer.parseInt(num[i])) < (Integer.parseInt(num[i + 1]))) {
				temp = num[i];
				num[i] = num[i + 1];
				num[i + 1] = temp;
				break;
			}
		}
		for (int i = 0; i < D; i++) {
			System.out.print(num[i]);
		}
	}
}

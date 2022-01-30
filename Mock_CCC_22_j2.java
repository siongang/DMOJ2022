package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mock_CCC_22_j2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		int n = Integer.parseInt(arr[0]);
		int k = Integer.parseInt(arr[1]);

		String input = br.readLine();
		int counter = k;
		int walk = 0;

		for (int i = 0; i < input.length(); i++) {

			if (input.charAt(i) == 'U') {
				if (counter - 1 > -1) {
					counter--;

				}
			} else if (input.charAt(i) == 'D') {
				counter++;

			}

			if (counter == 0) {

				walk++;

			}
		}
		System.out.println(walk);
	}
}

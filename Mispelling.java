package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mispelling {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());
		for (int i = 1; i <= input; i++) {
			String[] arr = new String[2];
			arr[0] = "";
			String in = br.readLine();
			int index = 0;
			for (int m = 0; m < in.length(); m++) {
				
				if (in.charAt(m) == ' ') {
					index = m;
					break;
					
				}
				arr[0] = arr[0] + in.charAt(m);
			}
			arr[1] = in.substring(index + 1);
			
			System.out.println(i + " " + input(Integer.parseInt(arr[0]), arr[1]));

		}

	}

	public static String input(int num, String word) {
		String string = "";
		for (int i = 1; i <= word.length(); i++) {
			if (i != num) {
				string = string + word.charAt(i - 1);
			}
		}

		return string;
	}

}

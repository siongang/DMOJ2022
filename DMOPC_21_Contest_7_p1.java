package DMOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DMOPC_21_Contest_7_p1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] in = br.readLine().split(" ");
		int N = Integer.parseInt(in[0]);
		int M = Integer.parseInt(in[1]);
		boolean out = true;
		long[][] arr = new long[N][M];
		long max = 0;
		for (int i = 0; i < N; i++) {
			in = br.readLine().split(" ");
			for (int m = 0; m < M; m++) {
				arr[i][m] = Long.parseLong(in[m]);
				if (arr[i][m] > max)
					max = arr[i][m];
			}
		}

		OUTER: for (int i = N - 1; i >= 0; i--) {
			for (int k = M - 1; k >= 0; k--) {
				if (arr[i][k] == 0) {
					if (k + 1 < M && i + 1 < N) { // checking bounds
						if (arr[i + 1][k] == 1 || arr[i][k + 1] == 1) {
							out = false;
							break OUTER;
						}

						if (arr[i + 1][k] > arr[i][k + 1]) {
							arr[i][k] = arr[i][k + 1] - 1;

						} else {
							arr[i][k] = arr[i + 1][k] - 1;
						}

					} else if (i + 1 < N) { // checking vert bounds
						if (arr[i + 1][k] == 1) {
							out = false;
							break OUTER;
						}
						arr[i][k] = arr[i + 1][k] - 1;

					} else if (k + 1 < M) { // checking horz bounds
						if (arr[i][k + 1] == 1) {

							out = false;
							break OUTER;
						}
						arr[i][k] = arr[i][k + 1] - 1;

					} else {
						arr[i][k] = max + M + N;
					}
				}
				if (i - 1 > 0) {
					if (arr[i][k] <= arr[i - 1][k]) {
						out = false;
						break OUTER;
					}

				} else if (k - 1 > 0) {
					if (arr[i][k] <= arr[i][k - 1]) {
						out = false;
						break OUTER;
					}
				}
			}
		}

		if (out == true) {
			for (int i = 0; i < N; i++) {
				for (long el : arr[i]) {
					System.out.print(el + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println(-1);
		}
	}

}

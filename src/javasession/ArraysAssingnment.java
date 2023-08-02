package javasession;

import java.util.Arrays;

public class ArraysAssingnment {

	public static void main(String[] args) {
		int p[] = { 1, 4, 5, 2, 3, 22, 31, 2 };
		int[] a = new int[p.length - 1];

		int j = 0;
		for (int i = 0; i < p.length; i++) {
			if (p[i] != 22) {
				a[j] = p[i];
				j++;
			}
		}

		System.out.println(Arrays.toString(a));

		System.out.println("==================");

		Object player1[] = new Object[6];
		player1[0] = "sachin";
		player1[1] = 30;
		player1[2] = "India";
		player1[3] = 5000;
		player1[4] = 89.9;
		player1[5] = 'm';
		System.out.println(Arrays.toString(player1));

		Object player2[] = new Object[6];
		player2[0] = "virat";
		player2[1] = 30;
		player2[2] = "India";
		player2[3] = 5000;
		player2[4] = 89.9;
		player2[5] = 'm';
		System.out.println(Arrays.toString(player2));
		Object player3[] = new Object[6];
		player3[0] = "sachin";
		player3[1] = 30;
		player3[2] = "India";
		player3[3] = 5000;
		player3[4] = 89.9;
		player3[5] = 'm';
		System.out.println(Arrays.toString(player3));
		Object player4[] = new Object[6];
		player4[0] = "sachin";
		player4[1] = 30;
		player4[2] = "India";
		player4[3] = 5000;
		player4[4] = 89.9;
		player4[5] = 'm';
		for (Object e : player4) {
			System.out.println(e + " ");
		}
		// System.out.println(Arrays.toString(player4));

		System.out.println("===========================================");

	}

}

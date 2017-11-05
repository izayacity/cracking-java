package Misc;

class Solution {
	long fibonacci (int n) {
		if (n == 0) {
			return 0;
		}
		long a = 0;
		long b = 1;

		for (int i = 2; i < n; i++) {
			long c = a + b;
			a = b;
			b = c;
		}
		return a + b;
	}


}

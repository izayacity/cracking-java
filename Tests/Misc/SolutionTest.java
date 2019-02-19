package Misc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static Misc.Solution.listSum;

class SolutionTest {
	private Solution solution;
	SolutionTest() {
		solution = new Solution();
	}

	@Test
	void fibonacciTest() {
		// Test case 1
		long expected = 1;
		long actual = solution.fibonacci(2);
		assertEquals(expected, actual);

		// Test case 2
		expected = 55;
		actual = solution.fibonacci(10);
		assertEquals(expected, actual);

		// Test case 3
		expected = 610;
		actual = solution.fibonacci(15);
		assertEquals(expected, actual);

		System.out.println(solution.fibonacci(8181));
	}

	@Test
	public void deductSuppliesAny() {
		// test 1
		List<Integer> inputList = new ArrayList<>(Arrays.asList(100, 98, 90, 95));
		int count = 50;
		List<Integer> list = solution.deductSuppliesAny(inputList, count);
		Assert.assertEquals(listSum(inputList) - count, listSum(list));

		Assert.assertEquals(83, list.get(0).intValue());
		Assert.assertEquals(83, list.get(1).intValue());
		Assert.assertEquals(83, list.get(2).intValue());
		Assert.assertEquals(84, list.get(3).intValue());

		// test 2
		inputList = new ArrayList<>(Arrays.asList(17, 15, 15, 15));
		count = 20;
		list = solution.deductSuppliesAny(inputList, count);
		Assert.assertEquals(listSum(inputList) - count, listSum(list));

		Assert.assertEquals(10, list.get(0).intValue());
		Assert.assertEquals(10, list.get(1).intValue());
		Assert.assertEquals(11, list.get(2).intValue());
		Assert.assertEquals(11, list.get(3).intValue());

		// test 3
		inputList = new ArrayList<>(Arrays.asList(2, 2, 1, 1));
		count = 7;
		list = solution.deductSuppliesAny(inputList, count);
		Assert.assertNull(list);

		// test 4
		count = 6;
		list = solution.deductSuppliesAny(inputList, count);
		Assert.assertEquals(0, listSum(list));
	}
}
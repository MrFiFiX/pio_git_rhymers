package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int EMPTY_TOTAL = -1;
	
	private final int[] numbers = new int[ARRAY_SIZE];

	public int total = EMPTY_TOTAL;

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		int DEFAULT_VALUE = EMPTY_TOTAL;
		return total == DEFAULT_VALUE;
	}

	public boolean isFull() {
		return total == ARRAY_SIZE - 1;
	}

	protected int peekaboo() {
		if (callCheck())
			return EMPTY_TOTAL;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return EMPTY_TOTAL;
		return numbers[total--];
	}
}

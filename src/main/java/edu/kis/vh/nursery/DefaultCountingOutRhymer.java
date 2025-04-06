package edu.kis.vh.nursery;

/**
 * Simple LIFO using array: {@link #numbers} with methods: {@link #countIn(int)}, {@link #callCheck()},
 * {@link #isFull()}, {@link #peekaboo()}, {@link #countOut()}.
 */
public class DefaultCountingOutRhymer {

	private static final int ARRAY_SIZE = 12;
	private static final int EMPTY_TOTAL = -1;
	private static final int DEFAULT_VALUE = -1;
	//Todo: needs refactor - static size array can be replaced by IntLinkedList
	/**
	 * Array of numbers of size {@link #ARRAY_SIZE}
	 */
	private final int[] numbers = new int[ARRAY_SIZE];

	/**
	 * Value pointing to {@link #numbers} index.
	 * Equal {@link #DEFAULT_VALUE} if {@link #numbers} is empty
	 *
	 * @see #callCheck()
	 */
	private int total = EMPTY_TOTAL;

	/**
	 * Add value if {@link #numbers} is not full
	 *
	 * @param in Value to be added to {@link #numbers}
	 * @see #isFull()
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * Check if {@link #numbers} is empty
	 *
	 * @return {@code true} if {@link #total} == {@link #DEFAULT_VALUE}. {@code false} otherwise;
	 */
	public boolean callCheck() {
		return total == DEFAULT_VALUE;
	}

	/**
	 * Check if {@link #numbers} is full
	 *
	 * @return {@code true} if {@link #total} == {@link #DEFAULT_VALUE} - 1. {@code false} otherwise;
	 */
	public boolean isFull() {
		return total == ARRAY_SIZE - 1;
	}

	/**
	 * Read value from {@link #numbers}.
	 *
	 * @return Value from {@link #numbers} at index equal {@link #total}.
	 * If {@link #callCheck()} is true return {@link #EMPTY_TOTAL}
	 */
	protected int peekaboo() {
		if (callCheck())
			return EMPTY_TOTAL;
		return numbers[total];
	}

	/**
	 * Read value from {@link #numbers}. {@link #total} decremented by 1 if {@link #callCheck()} is {@code false}.
	 *
	 * @return The same things as {@link #peekaboo()}
	 */
	public int countOut() {
		if (callCheck())
			return EMPTY_TOTAL;
		return numbers[total--];
	}
}
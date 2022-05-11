package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINUS_ONE = -1;
    public static final int MAX_SIZE = 12;
    private final int[] NUMBERS = new int[MAX_SIZE];

    private int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull()) {
            total++;
            NUMBERS[getTotal()] = in;
        }
    }

    public boolean callCheck() {
        return getTotal() == MINUS_ONE;
    }

    public boolean isFull() {
        return getTotal() == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        total--;
        return NUMBERS[getTotal()];
    }

    public int getTotal() {
        return total;
    }
}

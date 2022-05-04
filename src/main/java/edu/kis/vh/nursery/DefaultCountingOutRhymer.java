package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINUS_ONE = -1;
    public static final int TVELVE = 12;
    private final int[] NUMBERS = new int[TVELVE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == TVELVE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[total--];
    }

}

package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MINUS_ONE = -1;
    public static final int TWELVE = 12;
    private final int[] NUMBERS = new int[TWELVE];

    public int total = MINUS_ONE;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == MINUS_ONE;
    }

    public boolean isFull() {
        return total == TWELVE - 1;
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

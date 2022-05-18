package edu.kis.vh.nursery;

import java.nio.charset.StandardCharsets;

/**
 * Klasa DefaultCountingOutRhymer definiuje podstawowe
 * działanie licznika przechowującego maksymalnie MAX_SIZE
 * elementów w tablicy. Zapewnia ona metody służące do dodawania
 * lub usuwania pojedynczego elementu do tablicy,
 * sprawdzenia czy tablica jest pusta lub pełna,
 * podejżenia ostatniego elementu dodanego do licznika,
 * oraz sprawdzenia ilości elementów obecnie przechowywanych
 * w liczniku.
 */
public class DefaultCountingOutRhymer {

    //TODO MINUS_ONE wcale nie musi mieć wartości -1,
    // zmienna ta przyjmuje wartość oznaczającą, że tablica licznika jest pusta
    // co z kolei zależy od implementacji oraz intencji programisty
    public static final int MINUS_ONE = -1;
    public static final int MAX_SIZE = 12;
    private final int[] NUMBERS = new int[MAX_SIZE];

    private int total = MINUS_ONE;


    /**
     * Funkcja służy do dodania nowego elementu
     * do tablicy licznika przed uprzednik sprawdzeniem czy
     * licznik nie jest pełny (gdy funkcja {@link #isFull()}
     * zwróci {@code true} żadne działania nie zostaną podjęte).
     * @param in wartość, która ma być dodana do licznika
     */
    public void countIn(int in) {
        if (!isFull()) {
            total++;
            NUMBERS[getTotal()] = in;
        }
    }

    /**
     * Funkcja sprawdza czy licznik jest pusty
     * @return true wtedy i tylko wtedy gdy {@link #getTotal()} jest równe {@code MINUS_ONE}
     * (talblica licznika nie posiada żadnych elementów)
     */
    public boolean callCheck() {
        return getTotal() == MINUS_ONE;
    }

    /**
     * Funkcja sprawdza czy licznik jest pełny
     * @return true wtedy i tylko wtedy gdy {@link #getTotal()} jest równe {@code MAX_SIZE - 1}
     * (gdy nie ma więcej miejsca na nowe elementy w tablicy).
     */
    public boolean isFull() {
        return getTotal() == MAX_SIZE - 1;
    }

    /**
     * Funkcja daje możliwość podejżenia ostatniego elemetu w liczniku
     * bez zmieniania jego zawartości
     * @return wartość ostatniego elementu w tablicy licznika, lub -1 gdy ten jest pusty
     */
    protected int peekaboo() {
        if (callCheck())
            return MINUS_ONE;
        return NUMBERS[getTotal()];
    }

    /**
     * Funkcja zwraca ostatni element z licznika oraz usuwa go
     * z tablicy.
     * @return ostatni element w tablicy licznika lub -1 w przypadku gdy licznik jest pusty
     */
    public int countOut() {
        if (callCheck())
            return MINUS_ONE;
        int res = NUMBERS[getTotal()];
        total--;
        return res;
    }

    /**
     * Funkcja zwraca ilość obecnie przechowywanych elementów w tablicy licznika.
     * Zwrócona wartość {@code -1} oznacza, że tablica licznika jest obecnie pusta
     * czyli nie przechowuje żadnych elementów.
     * @return ilość elementów obecnie przechowywanych w liczniku
     */
    public int getTotal() {
        return total;
    }
}

package edu.kis.vh.nursery;

// 5, 14, 16, 17 linijka była źle sformatowana

/*
 * kombinacja klawiszy alt + → oraz alt + ← w środowkisu eclipse służy
 * do przełącznia się między ostatnimi edytowanymi plikami źródłowymi
 */

public class HanoiRhymer extends DefaultCountingOutRhymer {

int totalRejected = 0;

	public int reportRejected() {
		return totalRejected;
	}

	public void countIn(int in) {
	if (!callCheck() && in > peekaboo())
			totalRejected++;
			else
				super.countIn(in);
	}
}

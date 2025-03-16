package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    int totalRejectedCount = 0;

    public int reportRejected() {
        return totalRejectedCount;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejectedCount++;
        else
            super.countIn(in);
    }
}

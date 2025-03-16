package edu.kis.vh.nursery;

public class FIFORhymer extends defaultCountingOutRhymer {

    public defaultCountingOutRhymer temporaryRhymer = new defaultCountingOutRhymer();

    @Override
    public int countOut() {
        while (!callCheck())
            temporaryRhymer.countIn(super.countOut());

        int ret = temporaryRhymer.countOut();

        while (!temporaryRhymer.callCheck())
            countIn(temporaryRhymer.countOut());

        return ret;
    }
}

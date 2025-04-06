package edu.kis.vh.nursery;

import edu.kis.vh.nursery.list.IntLinkedList;
import org.junit.Assert;
import org.junit.Test;
//Testy dzialaja poprawnie po dokonaniu modyfikacji klas.
public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        int result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);

        rhymer.countIn(888);

        result = rhymer.callCheck();
        Assert.assertEquals(false, result);
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;
        for (int i = 0; i < STACK_CAPACITY; i++) {
            boolean result = rhymer.isFull();
            Assert.assertEquals(false, result);
            rhymer.countIn(888);
        }

        boolean result = rhymer.isFull();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.peekaboo();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
        result = rhymer.peekaboo();
        Assert.assertEquals(testValue, result);
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        int result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);

        int testValue = 4;
        rhymer.countIn(testValue);

        result = rhymer.countOut();
        Assert.assertEquals(testValue, result);
        result = rhymer.countOut();
        Assert.assertEquals(EMPTY_STACK_VALUE, result);
    }

    @Test
    public void testPushAndPop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_LIST_VALUE = -1;

        int result = list.pop();
        Assert.assertEquals(EMPTY_LIST_VALUE, result);

        int testValue = 4;
        list.push(testValue);

        result = list.pop();
        Assert.assertEquals(testValue, result);
        result = list.pop();
        Assert.assertEquals(EMPTY_LIST_VALUE, result);
    }

    @Test
    public void testIsEmpty() {
        IntLinkedList list = new IntLinkedList();

        boolean result = list.isEmpty();
        Assert.assertEquals(true, result);

        int testValue = 4;
        list.push(testValue);

        result = list.isEmpty();
        Assert.assertEquals(false, result);
        list.pop();
        result = list.isEmpty();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testTop() {
        IntLinkedList list = new IntLinkedList();
        final int EMPTY_LIST_VALUE = -1;

        int result = list.top();
        Assert.assertEquals(EMPTY_LIST_VALUE, result);

        int testValue = 4;
        list.push(testValue);

        result = list.top();
        Assert.assertEquals(testValue, result);
        list.pop();
        result = list.top();
        Assert.assertEquals(EMPTY_LIST_VALUE, result);
    }
}

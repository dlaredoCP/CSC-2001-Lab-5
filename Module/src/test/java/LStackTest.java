import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LStackTest {

    public static long measurement(long t){
        int n = 0;
        while (n>=0){
            LStack link = LStack.empty_stack();

            long startTime = System.nanoTime();
            for (int i=0; i<(Math.pow(2,n)); i++){
                link.push("a");
                link.pop();
            }
            long endTime = System.nanoTime();

            if (((endTime-startTime)/1000000)>t){
                IO.println("pushing and popping " + (Math.pow(2,n-1)) + " elements took less than " + t + " milliseconds.");
                return n-1;
            }
            n++;
        }
        return -1;
    }

    @Test
    void measurement(){
        long num = measurement(1000);
    }

    @Test
    void empty_stack(){
        LStack ex = new LStack(null);

        assertEquals(ex, LStack.empty_stack());
    }

    @Test
    void push(){
        LStack ex = LStack.empty_stack();
        LStack ex2 = LStack.empty_stack();

        ex2.push("a");
        ex2.push("b");
        ex.push("p");

        assertNotEquals(ex.size(), ex2.size());
    }

    @Test
    void pop(){
        LStack ex = LStack.empty_stack();
        LStack ex2 = LStack.empty_stack();
        LStack ex3 = LStack.empty_stack();

        ex2.push("a");
        ex2.push("b");
        ex.push("p");
        ex2.pop();

        assertEquals(ex.size(), ex2.size());
        assertThrows(IndexOutOfBoundsException.class, ()->ex3.pop());
    }

    @Test
    void peek(){
        LStack ex = LStack.empty_stack();

        ex.push("a");
        ex.push("b");
        ex.push("c");

        assertEquals("c", ex.peek());
    }

    @Test
    void is_empty(){
        LStack ex = LStack.empty_stack();

        ex.push("a");
        ex.push("b");
        ex.push("c");

        assertFalse(ex.is_empty());
    }
}
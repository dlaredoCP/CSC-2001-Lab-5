import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AStackTest {

    public static long measurement(long t){
        int n = 0;
        while (n>=0){
            AStack arr = new AStack(1, new String[1]);
            long startTime = System.nanoTime();
            for (int i=0; i<(Math.pow(2,n)); i++){
                arr.push("a");
                arr.pop();
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
    void equals(){
        AStack first = new AStack(3, new String[]{"a", "b", "c"});
        AStack second = new AStack(3, new String[]{"a", "b", "c"});

        assertEquals(true, first.equals(second));
    }

    @Test
    void empty_stack(){
        AStack first = new AStack(3, new String[]{"a", "b", "c"});
        AStack second = AStack.empty_stack();

        assertEquals(false,first.size()==second.size());
    }

    @Test
    void push(){
//        AStack first = new AStack(3, new String[]{"a", "b", "c"});
//        first.push("d");
        AStack other = AStack.empty_stack();
        other.push("thing");
        other.pop();
        assertEquals(0,other.size());
    }

    @Test
    void pop(){
        AStack first = new AStack(3, new String[]{"a", "b", "c"});
        String thing = first.pop();
        AStack second = new AStack(2, new String[]{"a", "b"});
        assertEquals(second.size(), first.size());
    }

    @Test
    void peek(){
        AStack first = new AStack(3, new String[]{"a", "b", "c"});
        assertEquals("c", first.peek());
    }

    @Test
    void is_empty(){
        AStack first = AStack.empty_stack();
        assertEquals(true, first.is_empty());
    }

}
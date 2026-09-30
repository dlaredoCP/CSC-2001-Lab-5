import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AStackTest {

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

        //TODO assertion
    }

    @Test
    void push(){
        AStack first = new AStack(3, new String[]{"a", "b", "c"});
        first.push("d");

        //TODO assertion
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void len(){
        LinkedList ex1 = new LinkedList("a", new LinkedList("n", null));
        assertEquals(2, LinkedList.length(ex1));
    }

}
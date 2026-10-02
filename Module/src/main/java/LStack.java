public class LStack{
    private LinkedList head;

    public LStack(LinkedList h){
        head = h;
    }

    /** */
    public int size(){
        return LinkedList.length(head);
    }

    /** Takes no arguments and returns an empty stack */
    public static LStack empty_stack() {
        return new LStack(null);
    }

    /** Accepts a String and pushes it onto the stack */
    public void push(String str){
        head = new LinkedList(str, head);
    }

    /** Removes and returns the top element. If there is no such element, raises an IndexError exception */
    public String pop(){
        if (head == null){
            throw new IndexOutOfBoundsException();
        } else {
            String val = head.value();
            head = head.rest();
            return val;
        }
    }

    /** Returns the top element, but does not remove it. If there is no such element, raises an IndexError exception */
    public String peek(){
        if (head == null){
            throw new IndexOutOfBoundsException();
        } else {
            return head.value();
        }
    }

    /** Returns true when the stack contains no elements */
    public boolean is_empty(){
        return head==null;
    }

}

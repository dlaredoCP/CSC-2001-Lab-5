import com.sun.jdi.InvalidCodeIndexException;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class AStack {
    private int length;
    private String[] stackArr;

    public int size(){
        return length;
    }

    public AStack(int length, String[] stackArr) {
        this.length = length;
        this.stackArr = stackArr;
    }

    /** Compares two AStack objects and return true if their elements are equal to each other, and false if not */
    public boolean equals(AStack arr){
        return arr.length == length && Arrays.equals(arr.stackArr, stackArr);
    }

    /** Takes no arguments and returns an empty stack */
    public static AStack empty_stack(){
        return new AStack(0, new String[1]);
    }

    /** Accepts a String and pushes it onto the stack */
    public void push(String s){
        if (length == 0){
            stackArr[0] = s;
            length++;
        } else {
            String [] newArr = new String[stackArr.length+1];
            System.arraycopy(stackArr, 0, newArr, 0, length);
            newArr[newArr.length-1] = s;
            stackArr = newArr;
            length++;
        }
    }

    /** Removes and returns the top element. If there is no such element, raises an IndexError exception */
    public String pop(){
        if (length==0){
            throw new IndexOutOfBoundsException();
        } else{
            String [] newArr = new String[stackArr.length-1];
            String top = stackArr[stackArr.length-1];
            System.arraycopy(stackArr, 0, newArr, 0, length-1);
            stackArr = newArr;
            length--;
            return top;
        }
    }

    /** Returns the top element, but does not remove it. If there is no such element, raises an IndexError exception */
    public String peek(){
        if (length==0){
            throw new IndexOutOfBoundsException();
        } else{
            return stackArr[length-1];
        }
    }

    /** Returns true when the stack contains no elements */
    public boolean is_empty(){
        return length==0;
    }

}

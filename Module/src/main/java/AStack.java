import java.util.Arrays;

public class AStack {
    private int length;
    private String[] stackArr;

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

}

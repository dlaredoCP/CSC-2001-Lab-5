public record LinkedList (String value, LinkedList rest){

    public static int length(LinkedList lst){
        switch (lst){
            case LinkedList(String v, LinkedList r):
                return 1 + length(r);
            case null:
                return 0;
        }
    }

}

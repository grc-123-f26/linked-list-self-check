public class Check {
    /**
     * Given the head of a linked list, return whether there are more even or 
     * odd values in the nodes.
     * 
     * If there are more even nodes, return "even"
     * If there are more odd nodes, return "odd"
     * If there are an equal of even and odd nodes, return "equal"
     * If head is null, return "equal"
     * 
     * @param head the head of the list
     * @return "even", "odd", or "equal" depending on whether there are more even or odd values
     */
    public static String evenOdd(ListNode head) {
        int evenS = 0;
        int oddS = 0;

        ListNode curr = head;
        while( curr != null){
            if(curr.data % 2 == 0){
                evenS ++;
            }else{
                oddS ++;
            }
            curr = curr.next;
        }
        if(evenS > oddS){
            return "even";
        }
        else if(evenS < oddS){
            return "odd";
        }
        else{
            return "equal";
        }
    }
}
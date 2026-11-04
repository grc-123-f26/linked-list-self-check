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
    public static String evenOdd(ListNode head) 
    {
        ListNode head = new ListNode();
        ListNode current = new ListNode();
        ListNode current = head;
        int countE = 0;
        int countO = 0;
        if(head == null){
            return "equal";
        }
        while(current < head)
            {
                if(current % 2 == 0)
                    {
                        countE++;
                    }else{
                        countO++;
                    }
                current = current.next;    
            }
        if(countE > countO)
            {
                return "even";
            }else if(countE == countO){
                return "equal";
            }else{
                return "odd";
            }
    }
}
/*    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
         */
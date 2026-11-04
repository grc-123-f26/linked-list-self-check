public class Check {
    public static String evenOdd(ListNode head) {
        int evenCount = 0;
        int oddCount = 0;
        ListNode current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            current = current.next;
        }

        if (evenCount > oddCount) {
            return "even";
        } else if (oddCount > evenCount) {
            return "odd";
        } else {
            return "equal";
        }
    }
}
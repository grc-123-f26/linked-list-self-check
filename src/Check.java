public class Check {

    public static String evenOdd(ListNode head) {
        int even = 0;
        int odd = 0;

        ListNode current = head;

        while (current != null) {
            if (current.data % 2 == 0) {
                even++;
            } else {
                odd++;
            }

            current = current.next;
        }

        if (even > odd) {
            return "even";
        } else if (odd > even) {
            return "odd";
        } else {
            return "equal";
        }
    }
}
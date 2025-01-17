public class _23ReverseSLL {
    private ListNode head;

    private static class ListNode{
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){

        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public ListNode reverse(ListNode head){
        if (head == null){
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        _23ReverseSLL sll = new _23ReverseSLL();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        // connect them together to form a chain
        sll.head.next = second; // 10 -> 1
        second.next = third; // 10 -> 1 -> 8
        third.next = fourth;  // 10 -> 1 -> 8 -> 11 -> null

        sll.display();
        ListNode reverseHead = sll.reverse(sll.head);
        sll.head = reverseHead;
        sll.display();
    }
    
}

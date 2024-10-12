public class _13SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data; // Generic Type
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        _13SinglyLinkedList sll = new _13SinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // connect them together to form a chain
        sll.head.next = second; // 10 -> 1
        second.next = third; // 10 -> 1 -> 8
        third.next = fourth;  // 10 -> 1 -> 8 -> 11 -> null

    }
    
}

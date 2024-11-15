public class _15FindLengthSinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
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

    public int length(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    public static void main(String[] args) {

        _15FindLengthSinglyLinkedList sll = new _15FindLengthSinglyLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        ListNode fifth = new ListNode(7);

        // connect them together to form a chain
        sll.head.next = second; 
        second.next = third; 
        third.next = fourth;
        fourth.next = fifth;
        
        // sll.display();
        System.out.println("Length is: " + sll.length());
    }
}

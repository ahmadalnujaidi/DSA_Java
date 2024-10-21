public class _21DeleteNodeGivenPositionSLL {
    public static void main(String[] args) {
        _21DeleteNodeGivenPositionSLL sll = new _21DeleteNodeGivenPositionSLL();
        sll.insertLast(3);
        sll.insertLast(4);
        sll.insertLast(7);
        sll.insertLast(8);
        sll.insertLast(9);
        sll.display();

        sll.delete(3);
        sll.display();
        sll.delete(1);
        sll.display();
        
    }

    public void delete(int position){
        // assuming position is valid and starting from 1
        // 3 -> 4 -> 7 -> 8 -> 9 -> null
        if (position == 1){
            head = head.next;
        } else {
            ListNode previous = head;
            int count = 1;
            while (count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }

    }

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

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (null != current.next) {
            current = current.next;
        }
        current.next = newNode;
    }
}

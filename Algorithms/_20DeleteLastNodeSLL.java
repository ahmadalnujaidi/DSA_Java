public class _20DeleteLastNodeSLL {
    public static void main(String[] args) {
        _20DeleteLastNodeSLL sll = new _20DeleteLastNodeSLL();

        //insert last method
        sll.insertLast(11); // 11 -> null
        sll.insertLast(8); // 11 -> 8 -> null
        sll.insertLast(1); // 11 -> 8 -> 1 -> null
        sll.insertLast(10); // 11 -> 8 -> 1 -> 10 -> null
        sll.display();

        System.out.println("Deleted node: " + sll.deleteLast().data); // 10 is removed
        sll.display();
        System.out.println("Deleted node: " + sll.deleteLast().data); // 1 is removed
        sll.display();

    }

    public ListNode deleteLast(){
            
        if (head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null; // break the linkage
        return current;
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

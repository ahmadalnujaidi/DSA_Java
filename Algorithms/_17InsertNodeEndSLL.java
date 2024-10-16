public class _17InsertNodeEndSLL {
    public static void main(String[] args) {

        _17InsertNodeEndSLL sll = new _17InsertNodeEndSLL();

        // test insertLast method
        sll.insertLast(11); // 11 -> null
        sll.insertLast(8); // 11 -> 8 -> null
        sll.insertLast(1); // 11 -> 8 -> 1 -> null
        
        sll.display();
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
    
}

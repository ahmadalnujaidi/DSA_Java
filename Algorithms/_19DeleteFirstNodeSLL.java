public class _19DeleteFirstNodeSLL {
    
    public static void main(String[] args) {
                
        _19DeleteFirstNodeSLL sll = new _19DeleteFirstNodeSLL();

        //insert last method
        sll.insertLast(11); // 11 -> null
        sll.insertLast(8); // 11 -> 8 -> null
        sll.insertLast(1); // 11 -> 8 -> 1 -> null
        sll.insertLast(10); // 11 -> 8 -> 1 -> 10 -> null

        sll.display();

        System.out.println("Deleted first node: " + sll.deleteFirst().data);
        sll.display();
        System.out.println("Deleted first node: " + sll.deleteFirst().data);
        sll.display();
    }

    public ListNode deleteFirst() {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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

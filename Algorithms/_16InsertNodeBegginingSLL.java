public class _16InsertNodeBegginingSLL {

    public static void main(String[] args) {

        _16InsertNodeBegginingSLL sll = new _16InsertNodeBegginingSLL();

        // test insertFirst method
        sll.insertFirst(11); // 11 -> null
        sll.insertFirst(8); // 8 -> 11 -> null
        sll.insertFirst(1); // 1 -> 8 -> 11 -> null
        
        sll.display();
    }


    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
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

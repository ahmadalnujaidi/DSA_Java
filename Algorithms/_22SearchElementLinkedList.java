public class _22SearchElementLinkedList {

    public static void main(String[] args) {

        _22SearchElementLinkedList sll = new _22SearchElementLinkedList();

        sll.head = new ListNode(10);
        ListNode second = new ListNode(8);
        ListNode third = new ListNode(1);
        ListNode fourth = new ListNode(11);

        // connect them together to form a chain
        sll.head.next = second; // 10 -> 1
        second.next = third; // 10 -> 1 -> 8
        third.next = fourth;  // 10 -> 1 -> 8 -> 11 -> null

        sll.display();

        if(sll.find(sll.head, 9)){
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }
    }

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

    public boolean find(ListNode head, int searchKey){
        if (head == null){
            return false;
        }
        ListNode current = head;
        while (current != null){
            if (current.data == searchKey){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    
}

public class _18InsertNodeGivenPos {
    public static void main(String[] args) {
            
            _18InsertNodeGivenPos sll = new _18InsertNodeGivenPos();
    
            // test insertAtPosition method
            sll.insertAtPosition(3, 1); // 3 -> null
            sll.insertAtPosition(5, 2); // 3 -> 5 -> null
            sll.insertAtPosition(2, 1); // 2 -> 3 -> 5 -> null
            sll.insertAtPosition(4, 2); // 2 -> 4 -> 3 -> 5 -> null
            sll.insertAtPosition(7, 5); // 2 -> 4 -> 3 -> 5 -> 7 -> null

            sll.display();
    

        
    }

    public void insertAtPosition(int value, int position) {
        // 1 -> 4 -> 5 and if we insert 6 at position 2 then it should be 1 -> 6 -> 4 -> 5
        ListNode newNode = new ListNode(value);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            ListNode previous = head;
            int count = 1; // position - 1
            while (count < position - 1) {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            newNode.next = current;
            previous.next = newNode;
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
    
}

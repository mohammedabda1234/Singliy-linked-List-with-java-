public class SinglyLinkedList {
    private listNode head;
    private static class listNode{

        int data;
        listNode next;
        public listNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void insertFirst(int value) {
        listNode newNode = new listNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void print(){
        listNode current = head;
        while (current != null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }
    public int length() {
        if(head == null) {
            return 0;
        }
        listNode current = head;
        int count = 0;
        while(current != null) {
            count++;
            current = current.next;
        }
        System.out.print("the length of LinkedList "+count);
        return count;
    }
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.insertFirst(0);
        sll.insertFirst(3);
        sll.insertFirst(5);
        sll.insertFirst(7);
        sll.print();
        sll.length();
    }

}

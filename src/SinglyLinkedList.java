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
    public void insertLast(int value) {
        listNode newNode = new listNode(value);
        if(head == null) {
            head = newNode;
            return ;
        }
        listNode crueent = head;
        while(null != crueent.next) {
            crueent = crueent.next;
        }
        crueent.next = newNode;
    }
    public void insert(int value,int position) {

        listNode node = new listNode(value);

        if(position == 1) {
            node.next = head;
            node = head;
        }
        listNode previuos = head;
        int count = 1;
        while(count <position -1) {
            previuos = previuos.next;
            count++;
        }
        listNode current = previuos.next;
        previuos.next = node;
        node.next = current;

    }
    public listNode deleteFirst() {
        if(head == null) {
            return null;
        }
        listNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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

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
    public listNode deleteLast() {
        if(head == null || head.next == null) {
            return head;
        }
        listNode current = head;
        listNode perivous = null;
        while(current.next != null) {
            perivous = current;
            current = current.next;
        }
        perivous.next = null;
        return current;

    }

    public void delete(int position) {
        if(position == 1) {
            head = head.next;
        }else {
            listNode perivous = head;
            int count =1;
            while(count < position - 1) {
                perivous = perivous.next;
                count++;

            }
            listNode current = perivous.next;
            perivous.next = current.next;
        }
    }
    public boolean search(int searchKey) {
        if(head == null) {
            return false;
        }
        listNode current = head;
        while(current != null) {
            if(current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void reverse() {
        if(head == null) {
            return;
        }
        listNode pointer = head;
        listNode previous = null;
        listNode current = null;

        while (pointer != null) {
            current = pointer;
            pointer = pointer.next;

            current.next = previous;
            previous = current;
            head = current;

        }
    }

    public listNode midNode() {

        if(head == null) {
            return null;
        }

        listNode slowPointer = head;
        listNode fastpointer = head;

        while(fastpointer != null && fastpointer.next != null) {

            fastpointer = fastpointer.next.next;
            slowPointer =  slowPointer.next;

            System.out.println(slowPointer.data);
        }
        return slowPointer;

    }
    public void removeDublicate() {
        if(head == null) {
            return ;
        }
        listNode current = head;

        while(current != null && current.next != null) {
            if(current.data == current.next.data) {
                current.next = current.next.next;

            }
            else {
                current = current.next;
            }
        }
    }
    public listNode insertInSortedList(int value) {
        listNode newNode = new listNode(value);

        if(head == null) {
            return newNode;
        }

        listNode current = head;
        listNode temp = null;

        while(current != null && current.data < newNode.data) {

            temp = current;
            current = current.next;


        }
        newNode.next = current;
        temp.next = newNode;
        return head;
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

package LinkedList;

public class DisplayLinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {

        Node a = new Node(5);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(6);
        Node f = new Node(8);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node temp = a;
        // for(int i=1; i<=5; i++){
        //     System.out.print(temp.data+" ");
        //     temp = temp.next;
        // }

        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}

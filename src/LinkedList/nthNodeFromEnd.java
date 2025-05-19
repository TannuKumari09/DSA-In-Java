package LinkedList;

public class nthNodeFromEnd {
    public  static Node nthNode(Node head, int n){
        Node fast = head;
        Node slow = head;
        for(int i=1; i<=n; i++){
            fast = fast.next;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;
        return head;
    }
    public static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public  static void Display(Node head){
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
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
        Display(a);
        a = nthNode(a, 6);
        Display(a);
    }
}

public class LinkedL {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    // Methods
    // To add data
    public void addFirst(int data){
        // Step1 :- Create new node
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }

        // Step2 :- newNode next = head
        newNode.next = head;

        // Step3 :- head = newNode
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedL ll = new LinkedL();
        ll.addFirst(1);
        ll.addFirst(2);
        System.out.println(ll);
    }
}

public class Linked {

    public static Node convertArrayToDll(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node newNode = new Node(arr[i], null, prev);
            prev.next = newNode;
            prev = prev.next;
        }

        return head;
    }

    public static void printDll(Node head) {

        Node prev = head;

        while (prev != null) {
            System.out.print(prev.data + " ");
            prev = prev.next;
        }

    }

    public static Node deleteLastNode(Node head) {
        Node prev = head;
        while (prev.next != null) {
            prev = prev.next;
        }
        prev.prev.next = null;
        prev.prev = null;

        return head;
    }

    public static Node addNodeAtLast(Node head, int k) {

        Node prev = head;
        if (prev == null) {
            return new Node(k);
        }

        while (prev.next != null) {
            prev = prev.next;
        }
        Node newNode = new Node(k);
        newNode.prev = prev;
        prev.next = newNode;

        return head;
    }

    public static void bl() {
        System.out.println();
    }

    public static Node reverseTheDll(Node head) {
      
       Node curr =head;
       Node last=null;

       while(curr!=null){
        last=curr.prev;
        curr.prev=curr.next;
        curr.next=last;
        curr=curr.prev;
       }

       return last.prev;
       

    }

    public static Node addElementAtK(Node head, int k, int val) {
        int count = 0;
        Node prev = head;

        while (prev != null) {
            count++;
            if (count == k) {
                break;
            }
            prev = prev.next;
        }
        Node newNode = new Node(val);
        newNode.next = prev.next;
        newNode.prev = prev;
        prev.next = newNode;

        return head;
    }

    public static Node deleteKthNode(Node head, int k){
        Node temp= head;
        int count=0;

        while(temp!=null){
            count++;
            if(count==k){
                break;
            }
            temp=temp.next;
        }

        Node prev=temp.prev;
        Node next=temp.next;

        if(prev==null && next==null){
            return null;
        }
        if(prev==null){
            Node newNode=head.next;
            head.next=null;
            return newNode;
        }

        if(next==null){
            temp.prev=null;
            prev.next=null;
            return head;
        }
        temp.prev=null;
        temp.next=null;

        prev.next=next;
        next.prev=prev;

        return head;

    }

    // -------------------------Insertion of nodes------------------------------
    public static Node insertBeforeHead(Node head,int val){
        Node newNode=new Node(val);
        head.prev=newNode;
        newNode.next=head;
        head=newNode;
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1,2,3,4,5,6,7,8 };

        Node head = convertArrayToDll(arr);
        

        printDll(reverseTheDll(head));

    }
}

class Node {
    int data;
    Node next;
    Node prev;

    Node() {
        this.data = 0;
        this.next = null;
        this.prev = null;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Node(int data, Node next, Node prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

}
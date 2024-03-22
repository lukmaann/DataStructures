import java.util.Stack;

public class SingleLinked {
    
    public static Node constructLL(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;

        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }


        return head;
    }
    public static void printll(Node head){

        Node prev=head;

        while(prev!=null){
            System.out.print(prev.val+" ");
            prev=prev.next;
        }

    }

    public static Node removeTail(Node head){
        Node prev=null;
        Node temp=head;

        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        
        return head;
    }

    public static Node removeNthNode(Node head, int n) {
        if (head == null) {
            return null; 
        }
    
        if (n == 0) {
            return head.next; 
        }
    
        Node prev = null;
        Node curr = head;
        int count = 0;
    
        while (curr != null) {
            if (count == n) {
                break;
            }
            prev = curr;
            curr = curr.next;
            count++;
        }
    
        // if (curr == null) {
        //     return head; // If n is greater than the number of nodes, return the original list
        // }
    
        if (prev != null) {
            prev.next = curr.next;
        }
    
        return head;
    }
    

    public static Node removeHead(Node head){
        Node newHead=head.next;
        head.next=null;
        head=newHead;
 
        return head;
    }

    public static Node reverseList(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node newHead=reverseList(head.next);
        Node front=head.next;
        front.next=head;
        head.next=null;
        
      
        return newHead; 
    }


    public static Node evenOdd(Node head){
        Node temp=head;
        Node temp2=head.next;
        Node even=head.next;

        while (temp.next!=null && temp!=null) {
            temp.next=temp.next.next;
            temp2.next=temp2.next.next;
            temp=temp.next;
            temp2=temp2.next;
        }
        temp.next=even;

       
        return head ;
        
    }


    public static Node removeKthNode(Node head, int K)
    {
        Node fast=head;
        for(int i=0;i<K;i++){
            fast=fast.next;
        }

        Node slow=head;


        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next;
        }
        
        if(slow== null){
            head=head.next;
            return head;
        }

        slow.next=slow.next.next;
        slow.next=null;
     
   
     
      return head;
    }


   



    public static void main(String[] args) {
        int arr[]={1,2,3};
        Node head=constructLL(arr);
        printll(removeKthNode(head,3));
        
    }
}
class Node{
    int val;
    Node next;

    Node(int val){
        this.val=val;
    }

    Node(int val,Node next){
        this.val=val;
        this.next=next;
    }
}
public class sortLL {



    public static Node convertArrayToLL(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;


        for(int i=1;i<arr.length;i++){
            Node newNode= new Node(arr[i]);
            prev.next=newNode;
            prev=newNode;      
        }



        return head;
    }

    public static void printLL(Node head){
        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void mergeSort(Node head){
        if(head==null){
            return ;
        }
        Node mid=findMiddle(head);
        mergeSort(head);
    }




    public static Node findMiddle(Node head){
        Node fast=head;
        Node slow=head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }

        return slow;


    }




    public static void main(String[] args) {
        int arr[]={9,8,7,6,5,4,3,2,1};
        Node head=convertArrayToLL(arr);

        printLL(head);
    }
    
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
    Node (int data, Node next){
        this.data=data;
        this.next=next;
    }
}
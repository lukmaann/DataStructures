import java.util.*;

public class practise{

  public static int[] nextGreaterElement(int arr[]){
    Stack<Integer> s= new Stack<>();
    
    int n=arr.length;
    int ans[]= new int[n];

    for(int i=n-1;i>=0;i--){
      int curr=arr[i];
      while (!s.isEmpty() && curr>=s.peek()) {
        s.pop();    
      }

      if(s.isEmpty()){
        ans[i]=0;
      }else{
        ans[i]=s.peek();
      }
      s.push(arr[i]);

    }

    return ans;

  }




  public static void printArray(int arr[]){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }



  public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};

    printArray(nextGreaterElement(arr));
    
  }
}
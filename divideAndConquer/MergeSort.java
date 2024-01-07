package  divideAndConquer;

import Arrays.mergeSortedArray;

public class MergeSort {

   public static void solution(int array[],int si,int ei){
    if(si>=ei){
        return;
    }
int mid=si+(ei-si)/2;
    solution(array,si,mid);
    solution(array,mid+1,ei);
    merge(array,si,mid,ei);
   }

   public static void merge(int array[],int si,int mid,int ei){
    int temp[]= new int[(ei-si)+1];

    int i=si;
    int j=mid+1;
    int k=0;

    while(i<=mid && j<=ei){
        if(array[i]<array[j]){
            temp[k]=array[i];
            i++;
        }else{
            temp[k]=array[j];
            j++;
        }
        k++;
    }

    while(i<=mid){
        temp[k++]=array[i++];

    }
    while(j<=ei){
        temp[k++]=array[j++];
    }

    for(k=0,i=si;k<temp.length;k++,i++){
        array[i]=temp[k];
    }
   }




    public static void printArray(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int array[]={2,3,1,4,5,7,6,8,0,9};
        
        printArray(array);
        solution(array, 0, array.length-1);
        printArray(array);
    
    }
    
}

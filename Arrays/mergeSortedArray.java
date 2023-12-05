package Arrays;

public class mergeSortedArray {


    public static void mergeArray(int nums1[],int m,int nums2[],int n){
        for(int i=0,j=m;i<n;i++){
            nums1[j]=nums2[i];
            j++;

        }
        
    }


    
    public static void main(String[] args) {
        int m=5;
        int n=5;
        int nums1[]=new int[m+n];
        int nums[]={1,3,5,7,9};

        for(int i=0;i<nums1.length-n;i++){
            nums1[i]=nums[i];
        }
       
        int nums2[]={2,4,6,8,10};
        mergeArray(nums1, m, nums2, n);

        sortArrays.countingSort(nums1);

        sortArrays.printArray(nums1);
        
        
    }
    
}

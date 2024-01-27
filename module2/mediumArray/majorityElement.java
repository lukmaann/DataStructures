package module2.mediumArray;

public class majorityElement {
    
    public static int solution(int []v) {
        int n=v.length;

        for(int i=0;i<n;i++){
            int cnt=0;

            for(int j=i;j<n;j++){

                if(v[i]==v[j]){
                    cnt++;
                }

            }

            if(cnt>n/2){
                return v[i];
            }
        }

        return -1;
        
       
    }
    public static void main(String[] args) {
        int v[]={2, 2, 1, 3, 1, 1, 3, 1, 1};

        System.out.println(solution(v));
        
    }
}

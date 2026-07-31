package ABC252;
import java.util.*;
public class ABC_252_Task_D {           //https://atcoder.jp/contests/abc252/tasks/abc252_d
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum =0;
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i =0;i<n;i++){
            int cur=arr[i];
            if(map.containsKey(cur)){
                    map.put(cur,map.get(cur)+1);
            }
            else{
                map.put(cur,1);
            }
        }
        for(int i=0;i<n;i++){
            int v =arr[i];

            int left=0;
            int right=n-1;
            int lb =0;
            int hb=0;
           
            while(left<right){
                int mid = left +(right-left)/2;
                 
                if(arr[mid]<v){
                    left++;
                }
                
                if(arr[mid]>=v){
                    lb=mid;
                    right--;
                }  
            }
                
                System.out.println(lb + " "+hb);
                sum+=(lb*hb);

            }
        
        System.out.println(sum);
        sc.close();

    }
    
}


package binary_search;


public class sorting {

    public int sort(int arr[],int x,int n){
        
       int start=0, end = n-1, mid =0; 
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid]<x){
                
            start = mid +1;
        }
            else if(arr[mid]>x){
                
            end = mid - 1;
        }
            else
                return mid;
    }
        return -1;
        
        
    }
}

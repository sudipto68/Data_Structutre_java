
package bubble_sort;


public class Bubble_sort {

    
    public static void main(String[] args) {
        
        int arr[] = {10,1,7,6,25,19,30,22};
        int n;
//        Scanner s = new Scanner(System.in);
//        System.out.println("Enter Limit: \n");
        n = arr.length;
        sorting sort = new sorting();
        sort.sorting(arr,n);
        System.out.println("After Sort\n");
        for(int k=0; k<n;k++)
        {
            System.out.println(arr[k]);
        }
    }
    
}
